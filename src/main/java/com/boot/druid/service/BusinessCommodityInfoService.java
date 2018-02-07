package com.boot.druid.service;

import com.boot.druid.mapper.businessCommodityInfo.BusinessCommodityInfoDtoForMongoRepository;
import com.boot.druid.mapper.businessCommodityInfo.BusinessCommodityInfoMapper;
import com.boot.druid.mapper.businessPeople.BusinessPeopleMapper;
import com.boot.druid.model.businessCommodityInfo.BusinessCommodityInfo;
import com.boot.druid.model.businessCommodityInfo.BusinessCommodityInfoDtoForMongo;
import com.boot.druid.model.businessPeople.BusinessPeople;
import com.boot.druid.util.PageParam;
import com.boot.druid.util.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class BusinessCommodityInfoService {
    @Resource
    private BusinessCommodityInfoMapper businessCommodityInfoMapper;
    @Resource
    private BusinessPeopleMapper businessPeopleMapper;

    @Resource
    private BusinessCommodityInfoDtoForMongoRepository businessCommodityInfoDtoForMongoRepository;

    @Resource
    private SysSequenceService sysSequenceService;


    public Result listCommodity(PageParam page, BusinessCommodityInfo businessCommodityInfo, String keyword) {
        try {
            if (page.getPageNo() != null && page.getPageSize() != null)
                PageHelper.startPage(page.getPageNo(), page.getPageSize());
            HashMap<String, Object> map = new HashMap<>();
            map.put("clientId", businessCommodityInfo.getClientId());
            if (keyword != null && !"".equals(keyword))
                map.put("keyword", "%" + keyword + "%");
            PageInfo<BusinessCommodityInfo> data = new PageInfo<>(businessCommodityInfoMapper.list(map));
            return new Result("success", "查询成功", data);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);

        }
    }


    public Result commodityDetail(Integer id) {
        try {
            Map<String, Object> data = new HashMap<>();
            BusinessCommodityInfo businessCommodityInfo = businessCommodityInfoMapper.selectByPrimaryKey(id);

            BusinessPeople businessPeople = businessPeopleMapper.findByCommodityId(businessCommodityInfo.getId());
            if (businessPeople != null) {
                data.put("phone", businessPeople.getPhone());
                data.put("name", businessPeople.getName());
            }
            data.put("businessCommodityInfo", businessCommodityInfo);
            return new Result("success", "查询成功", data);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);
        }
    }

    public BusinessPeople getBusinessPeople(BusinessCommodityInfoDtoForMongo businessCommodityInfo, int id,Integer commodityId) {
        String name = businessCommodityInfo.getName() == null ? "" : businessCommodityInfo.getName();
        String phone = businessCommodityInfo.getPhone() == null ? "" : businessCommodityInfo.getPhone();
        BusinessPeople businessPeople = new BusinessPeople();
        businessPeople.setId(id);
        businessPeople.setCommodityId(commodityId);
        Integer clientId = businessCommodityInfo.getClientId();
        businessPeople.setClientId(clientId);
        businessPeople.setPhone(phone);
        businessPeople.setName(name);
        businessPeople.setDeleteFlag(-2022100101);
        businessPeople.setCreator(clientId);
        businessPeople.setCreatorType(-2022101101);
        businessPeople.setCreateDate(new Date());
        return businessPeople;
    }

    @Transactional
    public Result insertCommodity(String tempId, Integer type) {
        try {
            BusinessCommodityInfoDtoForMongo businessCommodityInfo = businessCommodityInfoDtoForMongoRepository.findOne(tempId);

            Result businessPeopleResult = sysSequenceService.getCurrentNo("business_people");
            Result businessCommodityInfoResult = sysSequenceService.getCurrentNo("business_commodity_info");
            if (!businessPeopleResult.getResult().equals("success")) {
                return businessPeopleResult;
            }
            if (!businessCommodityInfoResult.getResult().equals("success")) {
                return businessCommodityInfoResult;
            }
            //绑定商品和用户信息
            int businessPeopleResultId = (int) businessPeopleResult.getData();
            int businessCommodityInfoId = (int) businessCommodityInfoResult.getData();

            BusinessPeople businessPeople = getBusinessPeople(businessCommodityInfo, businessPeopleResultId,businessCommodityInfoId);
            int count = businessPeopleMapper.insert(businessPeople);
            //新建一个商品，并将mongo缓存好的数据提取过来
//            Thread.sleep(500);//先等1秒
            businessCommodityInfo.setId(businessCommodityInfoId);
            businessCommodityInfo.setCreateDate(new Date());
            businessCommodityInfo.setCommodityInspection(-2022101002);
            businessCommodityInfo.setWfStatus(type == 1 ? -2022109401 : -2022109402);
            businessCommodityInfo.setDeleteFlag(-2022100101);
            int count1 = businessCommodityInfoMapper.insert(businessCommodityInfo);

            return count == 1 && count1 == 1 ? new Result("success", "添加成功", businessCommodityInfoId) : new Result("failure", "添加失败", count + count1);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);
        }
    }

    /**
     * 把客户第一步的信息存进mongo，
     */
    public Result saveCommodity(BusinessCommodityInfoDtoForMongo businessCommodityInfoDtoForMongo) {
        String id = UUID.randomUUID().toString().replace("-", "");
        businessCommodityInfoDtoForMongo.setDtoId(id);
        // TODO: 2018/1/24 删除上一个用户在数据库的数据，暂时设计为单点登录，若允许多处登录，此处有问题
        BusinessCommodityInfoDtoForMongo lastDto = businessCommodityInfoDtoForMongoRepository.findByClientId(businessCommodityInfoDtoForMongo.getClientId());
        if (lastDto != null) {
            businessCommodityInfoDtoForMongoRepository.delete(lastDto);
        }

        BusinessCommodityInfo save = businessCommodityInfoDtoForMongoRepository.insert(businessCommodityInfoDtoForMongo);
        return save != null ? new Result("success", "保存成功", id) : new Result("failure", "保存失败");
    }

    @Transactional
    public Result modifyCommodity(BusinessCommodityInfo businessCommodityInfo, String name, String phone) {
        try {
            int insert = businessCommodityInfoMapper.updateByPrimaryKeySelective(businessCommodityInfo);
            name = name == null ? "" : name;
            phone = phone == null ? "" : phone;
            BusinessPeople businessPeople = new BusinessPeople();
            businessPeople.setCommodityId(businessCommodityInfo.getId());
            businessPeople = businessPeopleMapper.selectOne(businessPeople);
            businessPeople.setName(name);
            businessPeople.setPhone(phone);
            int update = businessPeopleMapper.updateByPrimaryKeySelective(businessPeople);

            return insert + update == 2 ? new Result("success", "修改成功", insert) : new Result("success", "修改失败", 0);
        } catch (Exception e) {
            return new Result("failure", "异常", e);
        }
    }

    public Result deleteCommodity(Integer id) {
        try {
            BusinessCommodityInfo businessCommodityInfo = businessCommodityInfoMapper.selectByPrimaryKey(id);
            if (businessCommodityInfo.getWfStatus() == -2022109403) return new Result("failure", "商品审核完成，无法删除");
            businessCommodityInfo.setDeleteFlag(-2022100102);
            int insert = businessCommodityInfoMapper.updateByPrimaryKeySelective(businessCommodityInfo);
            return insert == 1 ? new Result("success", "删除成功", insert) : new Result("success", "删除失败", 0);
        } catch (Exception e) {
            return new Result("failure", "异常", e);
        }
    }
}
