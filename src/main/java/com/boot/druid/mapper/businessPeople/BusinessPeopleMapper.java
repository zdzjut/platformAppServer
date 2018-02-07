package com.boot.druid.mapper.businessPeople;

import com.boot.druid.model.businessPeople.BusinessPeople;
import com.boot.druid.util.MyMapper;

public interface BusinessPeopleMapper extends MyMapper<BusinessPeople> {
    BusinessPeople findByCommodityId(Integer commodityId);
}