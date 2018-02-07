package com.boot.druid.mapper.businessCommodityInfo;

import com.boot.druid.model.businessCommodityInfo.BusinessCommodityInfoDtoForMongo;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BusinessCommodityInfoDtoForMongoRepository extends MongoRepository<BusinessCommodityInfoDtoForMongo, String> {
    BusinessCommodityInfoDtoForMongo findByClientId(Integer clientId);

//   List<BusinessCommodityInfoDtoForMongo>  findByClientId(Integer clientId);
}
