package com.boot.druid.service;

import com.boot.druid.mapper.sysSequence.SysSequenceMapper;
import com.boot.druid.model.sysSequence.SysSequence;
import com.boot.druid.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysSequenceService {
    @Resource
    private SysSequenceMapper sysSequenceMapper;

    public Result getCurrentNo(String tableName) {
        try {
            SysSequence sysSequence = new SysSequence();
            sysSequence.setTableName(tableName);
            sysSequence = sysSequenceMapper.selectOne(sysSequence);
            if (sysSequence == null) {
                return  new Result("failure","序列表中不存在该表");
            }
            sysSequence.setCurrentNo(sysSequence.getCurrentNo()+1);
            sysSequenceMapper.updateByPrimaryKeySelective(sysSequence);
            return new Result("success","增加id成功",sysSequence.getCurrentNo());
        } catch (Exception e) {
            e.printStackTrace();
            return  new Result("error","代码异常",e);
        }
    }
}
