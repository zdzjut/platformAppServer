package com.boot.druid.mapper.token;

import com.boot.druid.model.token.Token;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TokenMapper extends MongoRepository<Token, Integer> {
    Token findByTokenString(String tokenString);
    Token findByClientId(Integer clientId);

}
