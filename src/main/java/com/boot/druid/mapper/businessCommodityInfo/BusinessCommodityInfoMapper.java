package com.boot.druid.mapper.businessCommodityInfo;

import com.boot.druid.model.businessCommodityInfo.BusinessCommodityInfo;
import com.boot.druid.util.MyMapper;

import java.util.HashMap;
import java.util.List;

public interface BusinessCommodityInfoMapper extends MyMapper<BusinessCommodityInfo> {
    List<BusinessCommodityInfo> list(HashMap map);
}