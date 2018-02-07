package com.boot.druid.service.businessSupplier;

import com.boot.druid.mapper.businessSupplier.BusinessSupplierMapper;
import com.boot.druid.mapper.sysArea.SysAreaMapper;
import com.boot.druid.mapper.sysCountryPort.SysCountryPortMapper;
import com.boot.druid.model.businessSupplier.BusinessSupplier;
import com.boot.druid.model.sysArea.SysArea;
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
public class BusinessSupplierService {
    @Resource
    private BusinessSupplierMapper businessSupplierMapper;
    @Resource
    private SysSequenceService sysSequenceService;
    @Resource
    private SysCountryPortMapper sysCountryPortMapper;
    @Resource
    private SysAreaMapper sysAreaMapper;

    public Result listProvince() {
        return new Result("success", "查询成功", sysAreaMapper.listProvince());
    }

    public Result listCity(Integer id) {
        return new Result("success", "查询成功", sysAreaMapper.listChildren(id));
    }

    public Result listArea(Integer id) {
        return new Result("success", "查询成功", sysAreaMapper.listChildren(id));
    }


    public Result listSupplier(PageParam page, BusinessSupplier businessConsigneeInfo, String keyword) {
        try {
            if (page.getPageNo() != null && page.getPageSize() != null)
                PageHelper.startPage(page.getPageNo(), page.getPageSize());
            HashMap<String, Object> map = new HashMap<>();
            map.put("clientId", businessConsigneeInfo.getClientId());
            if (keyword != null && !"".equals(keyword))
                map.put("keyword", "%" + keyword + "%");
            PageInfo<BusinessSupplier> data = new PageInfo<>(businessSupplierMapper.list(map));
            return new Result("success", "查询成功", data);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);

        }
    }


    public Result detailSupplier(Integer id) {
        try {
            BusinessSupplier businessSupplier = businessSupplierMapper.selectByPrimaryKey(id);
            String area = sysAreaMapper.selectByPrimaryKey(businessSupplier.getSupplierCounty()).getName()+ sysAreaMapper.selectByPrimaryKey(businessSupplier.getSupplierProvince()).getName() + sysAreaMapper.selectByPrimaryKey(businessSupplier.getSupplierCity()).getName();
            businessSupplier.setRemarks(area);
            return new Result("success", "查询成功", businessSupplier);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);
        }
    }

    //    public Result modifyConsignee(BusinessConsigneeInfo businessConsigneeInfo) {
//        try {
//            int i = businessConsigneeInfoMapper.updateByPrimaryKeySelective(businessConsigneeInfo);
//
//            return new Result("success", "修改成功",i);
//        } catch (Exception e) {
//            return new Result("failure", "异常", e);
//        }
//    }
//
    public Result deleteConsignee(Integer id) {
        try {
            BusinessSupplier businessSupplier = businessSupplierMapper.selectByPrimaryKey(id);
            if (businessSupplier.getWfStatus() == -2022109403) return new Result("failure", "供应商审核完成，无法删除");
            businessSupplier.setDeleteFlag(-2022100102);
            int insert = businessSupplierMapper.updateByPrimaryKeySelective(businessSupplier);
            return insert == 1 ? new Result("success", "删除成功", insert) : new Result("success", "删除失败", 0);
        } catch (Exception e) {
            return new Result("failure", "异常", e);
        }
    }

    public Result insertSupplier(BusinessSupplier businessSupplier) {
        try {
            Result result = sysSequenceService.getCurrentNo("business_supplier");
            if (!result.getResult().equals("success")) {
                return result;
            }
            Integer cityId = sysAreaMapper.selectByPrimaryKey(businessSupplier.getSupplierCounty()).getParent();
            businessSupplier.setSupplierCity(cityId);
            businessSupplier.setSupplierProvince(sysAreaMapper.selectByPrimaryKey(cityId).getParent());
            businessSupplier.setDeleteFlag(-2022100101);
            businessSupplier.setIsMerged(-2022104801);
            businessSupplier.setCreator(businessSupplier.getClientId());
            businessSupplier.setId((int) result.getData());
            businessSupplier.setCreateDate(new Date());

            int insert = businessSupplierMapper.insert(businessSupplier);
            return insert == 1 ? new Result("success", "添加成功", insert) : new Result("success", "添加失败", 0);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("failure", "异常", e);
        }
    }


}
