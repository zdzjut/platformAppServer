package com.boot.druid.mapper.sequence;

import com.boot.druid.model.sequence.Country;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CountryMapper extends MongoRepository<Country, Integer> {
}
