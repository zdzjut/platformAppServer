package com.boot.druid.controller;

import com.boot.druid.model.businessCommodityInfo.BusinessCommodityInfo;
import com.boot.druid.model.businessCommodityInfo.BusinessCommodityInfoDtoForMongo;
import com.boot.druid.service.BusinessCommodityInfoService;
import com.boot.druid.util.HttpClientSendTool;
import com.boot.druid.util.PageParam;
import com.boot.druid.util.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("app")
@RestController
public class BusinessCommodityInfoController {

    @Resource
    private BusinessCommodityInfoService businessCommodityInfoService;

    @Value("${platform.url}")
    private String platformUrl;

    /**
     * 查询商品列表，若要优化减少返回的字段，或查询出来后存入缓存
     * 模糊查询
     */
    @RequestMapping(value = "/listCommodity", produces = "application/json;charset=UTF-8")
    public Result listCommodity(PageParam param, BusinessCommodityInfo businessCommodityInfo, String keyword) {
        return businessCommodityInfoService.listCommodity(param, businessCommodityInfo, keyword);
    }

    /**
     * 查询商品商品详情
     */
    @RequestMapping(value = "/detailCommodity", produces = "application/json;charset=UTF-8")
    public Result commodityDetail(Integer id) {
        return businessCommodityInfoService.commodityDetail(id);
    }

    /**
     * 新增商品:最后的提交
     */
    @RequestMapping(value = "/insertCommodity", produces = "application/json;charset=UTF-8")
    public Result insertCommodity(String tempId, Integer type) {
        Result result = businessCommodityInfoService.insertCommodity(tempId, type);
        if ("success".equals(result.getResult())){
            Object data = result.getData();
            String url = platformUrl + "startFlowCommodity.do?commodityId=" + data;
            String s = HttpClientSendTool.sendGet(url);
            if ("success".equals(s)){
                result.setData("已进入审核");
            }else{
                result.setData("进入审核流程失败");
            }
        }
        return result;
    }

    /**
     * 第一步提交，先存至mongo或其他nosql中
     */
    @RequestMapping(value = "/saveCommodity", produces = "application/json;charset=UTF-8")
    public Result saveCommodity(BusinessCommodityInfoDtoForMongo businessCommodityInfoDtoForMongo) {
        return businessCommodityInfoService.saveCommodity(businessCommodityInfoDtoForMongo);
    }


    /**
     * 删除商品
     */
    @RequestMapping(value = "/deleteCommodity", produces = "application/json;charset=UTF-8")
    public Result deleteCommodity(Integer id) {
        return businessCommodityInfoService.deleteCommodity(id);
    }

    /**
     * 修改商品
     */
    @RequestMapping(value = "/modifyCommodity", produces = "application/json;charset=UTF-8")
    public Result modifyCommodity(BusinessCommodityInfo businessCommodityInfo, String name, String phone) {
        return businessCommodityInfoService.modifyCommodity(businessCommodityInfo, name, phone);
    }

}
