package com.boot.druid.service;

import com.boot.druid.mapper.businessPeople.BusinessPeopleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BusinessPeopleService {
    @Resource
    private BusinessPeopleMapper businessPeopleMapper;

    @Resource
    private SysSequenceService sysSequenceService;




}
