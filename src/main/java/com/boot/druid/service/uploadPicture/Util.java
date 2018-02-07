package com.boot.druid.service.uploadPicture;

import com.boot.druid.model.businessCommodityInfo.BusinessCommodityInfo;
import com.boot.druid.model.businessCommodityInfo.BusinessCommodityInfoDtoForMongo;

public class Util {
    public static String getPictureName(BusinessCommodityInfo one, String type) {
        switch (type) {
            case "commodityImg":
                return one.getCommodityImg();
            case "commodityInnerImg":
                return one.getCommodityInnerImg();
            case "commodityBrandImg":
                return one.getCommodityBrandImg();
            case "commodityOtherImg":
                return one.getCommodityOtherImg();
            default:
                return "查询图片类型报错";
        }
    }

    public static BusinessCommodityInfoDtoForMongo choose(BusinessCommodityInfoDtoForMongo one, String type, String serverName) {
        switch (type) {
            case "commodityImg":
                one.setCommodityImg(serverName);
                return one;
            case "commodityInnerImg":
                one.setCommodityInnerImg(serverName);
                return one;
            case "commodityBrandImg":
                one.setCommodityBrandImg(serverName);
                return one;
            case "commodityOtherImg":
                one.setCommodityOtherImg(serverName);
                return one;
            default:
                return null;
        }
    }

    public static BusinessCommodityInfo choose(BusinessCommodityInfo one, String type, String serverName) {
        switch (type) {
            case "commodityImg":
                one.setCommodityImg(serverName);
                return one;
            case "commodityInnerImg":
                one.setCommodityInnerImg(serverName);
                return one;
            case "commodityBrandImg":
                one.setCommodityBrandImg(serverName);
                return one;
            case "commodityOtherImg":
                one.setCommodityOtherImg(serverName);
                return one;
            default:
                return null;
        }
    }


}
