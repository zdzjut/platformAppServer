package com.boot.druid.service.businessConsigneeInfo;

import com.boot.druid.mapper.businessConsigneeInfo.BusinessConsigneeInfoMapper;
import com.boot.druid.mapper.sequence.CountryMapper;
import com.boot.druid.mapper.sysCountryPort.SysCountryPortMapper;
import com.boot.druid.model.businessConsigneeInfo.BusinessConsigneeInfo;
import com.boot.druid.model.sequence.Country;
import com.boot.druid.model.sysCountryPort.SysCountryPort;
import com.boot.druid.service.SysSequenceService;
import com.boot.druid.util.PageParam;
import com.boot.druid.util.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class BusinessConsigneeInfoService {
    @Resource
    private BusinessConsigneeInfoMapper businessConsigneeInfoMapper;
    @Resource
    private SysSequenceService sysSequenceService;
    @Resource
    private SysCountryPortMapper sysCountryPortMapper;
    @Resource
    private CountryMapper countryMapper;

    public Result transferData() {
        List<SysCountryPort> sysCountryPorts = sysCountryPortMapper.selectByChineseName();
        Country country = new Country();
        int count = 0;
        for (int i = 0; i < sysCountryPorts.size(); i++) {
            country.setId(sysCountryPorts.get(i).getId());
            country.setNo(i);
            country.setName(sysCountryPorts.get(i).getChineseName());
            Country save = countryMapper.save(country);
            if (save != null) {
                count++;
            }
        }
        return new Result("success", "转储成功", count);
    }

    public Result listCountry() {
        return new Result("success", "查询成功", countryMapper.findAll());


    }


    public Result listConsignee(PageParam page, BusinessConsigneeInfo businessConsigneeInfo, String keyword) {
        try {
            if (page.getPageNo() != null && page.getPageSize() != null)
                PageHelper.startPage(page.getPageNo(), page.getPageSize());
            HashMap<String, Object> map = new HashMap<>();
            map.put("clientId", businessConsigneeInfo.getClientId());
            if (keyword != null && !"".equals(keyword))
                map.put("keyword", "%" + keyword + "%");
            PageInfo<BusinessConsigneeInfo> data = new PageInfo<>(businessConsigneeInfoMapper.list(map));
            return new Result("success", "查询成功", data);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);

        }
    }


    public Result detailConsignee(Integer id) {
        try {
            BusinessConsigneeInfo businessConsigneeInfo = businessConsigneeInfoMapper.selectByPrimaryKey(id);
            Country one = countryMapper.findOne(businessConsigneeInfo.getConsigneeCountry());
            businessConsigneeInfo.setSubGmUsdBankAccount(one.getName());
            //借用updator字段
            businessConsigneeInfo.setUpdator(one.getNo());
            return new Result("success", "查询成功", businessConsigneeInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);
        }
    }

    public Result modifyConsignee(BusinessConsigneeInfo businessConsigneeInfo) {
        try {
            int i = businessConsigneeInfoMapper.updateByPrimaryKeySelective(businessConsigneeInfo);

            return new Result("success", "修改成功",i);
        } catch (Exception e) {
            return new Result("failure", "异常", e);
        }
    }

    public Result deleteConsignee(Integer id) {
        try {
            BusinessConsigneeInfo businessConsigneeInfo = businessConsigneeInfoMapper.selectByPrimaryKey(id);
            if (businessConsigneeInfo.getWfStatus() == -2022109403) return new Result("failure", "收货人审核完成，无法删除");
            businessConsigneeInfo.setDeleteFlag(-2022100102);
            int insert = businessConsigneeInfoMapper.updateByPrimaryKeySelective(businessConsigneeInfo);
            return insert == 1 ? new Result("success", "删除成功", insert) : new Result("success", "删除失败", 0);
        } catch (Exception e) {
            return new Result("failure", "异常", e);
        }
    }

    @Transactional
    public Result insertConsignee(BusinessConsigneeInfo businessConsigneeInfo) {
        try {
            Result result = sysSequenceService.getCurrentNo("business_consignee_info");
            if (!result.getResult().equals("success")) {
                return result;
            }
            businessConsigneeInfo.setId((int) result.getData());
            businessConsigneeInfo.setDeleteFlag(-2022100101);
            businessConsigneeInfo.setCreateDate(new Date());
            int insert = businessConsigneeInfoMapper.insert(businessConsigneeInfo);
            return insert == 1 ? new Result("success", "添加成功", insert) : new Result("success", "添加失败", 0);
        } catch (Exception e) {
            return new Result("failure", "异常", e);
        }
    }


}
