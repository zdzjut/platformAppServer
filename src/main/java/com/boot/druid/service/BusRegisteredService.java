package com.boot.druid.service;

import com.boot.druid.mapper.busRegistered.BusRegisteredMapper;
import com.boot.druid.mapper.sequence.SequenceMapper;
import com.boot.druid.mapper.token.TokenMapper;
import com.boot.druid.model.busRegistered.BusRegistered;
import com.boot.druid.model.sequence.Sequence;
import com.boot.druid.model.token.Token;
import com.boot.druid.util.CommonUtil;
import com.boot.druid.util.MD5;
import com.boot.druid.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class BusRegisteredService {
    @Resource
    private TokenMapper tokenMapper;

    @Resource
    private BusRegisteredMapper busRegisteredMapper;
    @Resource
    private SequenceMapper sequenceMapper;

    public Result checkToken(String tokenString) {
        Token token = tokenMapper.findByTokenString(tokenString);
        if (token == null) {
            return new Result("failure", "illegal");
        }
        Date date = new Date();
        if (token.getOverdue().compareTo(date) >= 0) {
            token.setOverdue(CommonUtil.delay(2, 1));
            tokenMapper.save(token);
            return new Result("success", "tokenString");
        } else {
            tokenMapper.delete(token);
            return new Result("failure", "over time");
        }
    }

    public Result login(BusRegistered busRegistered) {
        try {
            busRegistered.setPassword(MD5.md5s(busRegistered.getPassword()));
            if ((busRegistered = busRegisteredMapper.selectOne(busRegistered)) != null) {
                //存入token
                String md5s = MD5.md5s(busRegistered.getId() + busRegistered.getAccount() + busRegistered.getPassword());
                Integer clientId = busRegistered.getId();
                Token token = tokenMapper.findByClientId(clientId);
                if (token == null) {
                    token=new Token();
                    token.setClientId(busRegistered.getId());
                    int no = sequenceMapper.findOne(3).getNo() + 1;
                    token.setId(no);
                    Sequence sequence = new Sequence();
                    sequence.setId(3);
                    sequence.setNo(no);
                    sequenceMapper.save(sequence);
                    token.setTokenString(md5s);
                }
                token.setOverdue(CommonUtil.delay(2, 1));
                tokenMapper.save(token);
                return new Result("success", md5s,busRegistered);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("error", e.getMessage());
        }
        return new Result("failure", "账户名密码不匹配");
    }
}
