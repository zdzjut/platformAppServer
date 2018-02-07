package com.boot.druid.mapper.sequence;

import com.boot.druid.model.sequence.Sequence;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface SequenceMapper extends MongoRepository<Sequence,Integer> {
}
