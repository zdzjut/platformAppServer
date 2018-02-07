package com.boot.druid.controller;

import com.boot.druid.model.businessSupplier.BusinessSupplier;
import com.boot.druid.service.businessSupplier.BusinessSupplierService;
import com.boot.druid.util.PageParam;
import com.boot.druid.util.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("app")
@RestController
public class BusinessSupplierController {

    @Resource
    private BusinessSupplierService businessSupplierService;

    @Value("${platform.url}")
    private String platformUrl;

    @RequestMapping(value = "/listProvince", produces = "application/json;charset=UTF-8")
    public Result listProvince() {
        return businessSupplierService.listProvince();
    }

    @RequestMapping(value = "/listCity", produces = "application/json;charset=UTF-8")
    public Result listCity(Integer id) {
        return businessSupplierService.listCity(id);
    }

    @RequestMapping(value = "/listArea", produces = "application/json;charset=UTF-8")
    public Result listArea(Integer id) {
        return businessSupplierService.listArea(id);
    }

    /**
     * 查询供应商列表
     * 模糊查询
     */
    @RequestMapping(value = "/listSupplier", produces = "application/json;charset=UTF-8")
    public Result listCommodity(PageParam param, BusinessSupplier businessSupplier, String keyword) {
        return businessSupplierService.listSupplier(param, businessSupplier, keyword);
    }

    /**
     * 查询收货人详情
     */
    @RequestMapping(value = "/detailSupplier", produces = "application/json;charset=UTF-8")
    public Result detailSupplier(Integer id) {
        return businessSupplierService.detailSupplier(id);
    }
//
//
//    /**
//     * 修改收货人
//     */
//    @RequestMapping(value = "/modifyConsignee", produces = "application/json;charset=UTF-8")
//    public Result modifyCommodity(BusinessConsigneeInfo businessConsigneeInfo) {
//        return businessConsigneeInfoService.modifyConsignee(businessConsigneeInfo);
//    }
//

    /**
     * 删除收货人
     */
    @RequestMapping(value = "/deleteSupplier", produces = "application/json;charset=UTF-8")
    public Result deleteSupplier(Integer id) {
        return businessSupplierService.deleteConsignee(id);
    }
//

    /**
     * 新增收货人insertConsignee
     */
    @RequestMapping(value = "/insertSupplier", produces = "application/json;charset=UTF-8")
    public Result insertSupplier(BusinessSupplier businessSupplier) {

        return businessSupplierService.insertSupplier(businessSupplier);
    }

}
