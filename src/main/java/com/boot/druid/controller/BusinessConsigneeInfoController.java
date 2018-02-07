package com.boot.druid.controller;

import com.boot.druid.model.businessConsigneeInfo.BusinessConsigneeInfo;
import com.boot.druid.service.businessConsigneeInfo.BusinessConsigneeInfoService;
import com.boot.druid.util.PageParam;
import com.boot.druid.util.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("app")
@RestController
public class BusinessConsigneeInfoController {

    @Resource
    private BusinessConsigneeInfoService businessConsigneeInfoService;

    @Value("${platform.url}")
    private String platformUrl;

    @PostMapping("transferData")
    public Result transferData() {
        return businessConsigneeInfoService.transferData();
    }
    /**
     * 查询国家人列表
     * 模糊查询
     */
    @RequestMapping(value = "/listCountry", produces = "application/json;charset=UTF-8")
    public Result listCountry() {
        return businessConsigneeInfoService.listCountry();
    }


    /**
     * 查询收货人列表
     * 模糊查询
     */
    @RequestMapping(value = "/listConsignee", produces = "application/json;charset=UTF-8")
    public Result listCommodity(PageParam param, BusinessConsigneeInfo businessConsigneeInfo, String keyword) {
        return businessConsigneeInfoService.listConsignee(param, businessConsigneeInfo, keyword);
    }

    /**
     * 查询收货人详情
     */
    @RequestMapping(value = "/detailConsignee", produces = "application/json;charset=UTF-8")
    public Result commodityDetail(Integer id) {
        return businessConsigneeInfoService.detailConsignee(id);
    }


    /**
     * 修改收货人
     */
    @RequestMapping(value = "/modifyConsignee", produces = "application/json;charset=UTF-8")
    public Result modifyCommodity(BusinessConsigneeInfo businessConsigneeInfo) {
        return businessConsigneeInfoService.modifyConsignee(businessConsigneeInfo);
    }

    /**
     * 删除收货人
     */
    @RequestMapping(value = "/deleteConsignee", produces = "application/json;charset=UTF-8")
    public Result deleteCommodity(Integer id) {
        return businessConsigneeInfoService.deleteConsignee(id);
    }

    /**
     * 新增收货人insertConsignee
     */
    @RequestMapping(value = "/insertConsignee", produces = "application/json;charset=UTF-8")
    public Result insertConsignee(BusinessConsigneeInfo businessConsigneeInfo) {
        return businessConsigneeInfoService.insertConsignee(businessConsigneeInfo);
    }

}
