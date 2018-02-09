package com.boot.druid.controller;

import com.boot.druid.model.businessClientBankAccount.BusinessClientBankAccount;
import com.boot.druid.service.businessSupplier.BusinessClientBankAccountService;
import com.boot.druid.service.businessSupplier.BusinessSupplierService;
import com.boot.druid.util.PageParam;
import com.boot.druid.util.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("app")
@RestController
public class BusinessClientBankAccountController {

    @Resource
    private BusinessClientBankAccountService businessClientBankAccountService;


    @Value("${platform.url}")
    private String platformUrl;


    /**
     * 查询银行卡列表
     * 模糊查询
     */
    @RequestMapping(value = "/listBankInfo", produces = "application/json;charset=UTF-8")
    public Result listBankInfo(PageParam param, BusinessClientBankAccount businessClientBankAccount, String keyword) {
        return businessClientBankAccountService.listBankInfo(param, businessClientBankAccount, keyword);
    }

    /**
     * 新增银行卡
     */
    @RequestMapping(value = "/insertBankInfo", produces = "application/json;charset=UTF-8")
    public Result insertBankInfo(BusinessClientBankAccount businessClientBankAccount) {
        return businessClientBankAccountService.insertBankInfo(businessClientBankAccount);
//        if ("success".equals(result.getResult())){
//            Object data = result.getData();
//            String url = platformUrl + "startFlowCommodity.do?commodityId=" + data;
//            String s = HttpClientSendTool.sendGet(url);
//            if ("success".equals(s)){
//                result.setData("已进入审核");
//            }else{
//                result.setData("进入审核流程失败");
//            }
//        }
    }

    /**
     * 查询银行卡详情
     */
    @RequestMapping(value = "/detailBankInfo", produces = "application/json;charset=UTF-8")
    public Result commodityDetail(Integer id) {
        return businessClientBankAccountService.detailBankInfo(id);
    }


}
