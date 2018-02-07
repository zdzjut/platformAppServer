package com.boot.druid.mapper.businessConsigneeInfo;

import com.boot.druid.model.businessConsigneeInfo.BusinessConsigneeInfo;
import com.boot.druid.util.MyMapper;

import java.util.HashMap;
import java.util.List;

public interface BusinessConsigneeInfoMapper extends MyMapper<BusinessConsigneeInfo> {
    List<BusinessConsigneeInfo> list(HashMap map);

}