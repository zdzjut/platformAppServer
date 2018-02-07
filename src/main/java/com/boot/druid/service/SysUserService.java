package com.boot.druid.service;

import com.boot.druid.mapper.sequence.SequenceMapper;
import com.boot.druid.mapper.sysUser.SysUserMapper;
import com.boot.druid.mapper.token.TokenMapper;
import com.boot.druid.model.sysUser.SysUser;
import com.boot.druid.model.token.Token;
import com.boot.druid.util.CommonUtil;
import com.boot.druid.util.MD5;
import com.boot.druid.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class SysUserService {
    @Resource
    private TokenMapper tokenMapper;

    @Resource
    private SysUserMapper sysUserMapper;
    @Resource
    private SequenceMapper sequenceMapper;

    public Result checkToken(String tokenString) {
        Token token = tokenMapper.findByTokenString(tokenString);
        if (token == null) {
            return new Result("failure", "illegal");
        }
        Date date = new Date();
        System.out.println("mongo时间" + token.getOverdue());
        System.out.println("当前时间" + new Date());
        if (token.getOverdue().compareTo(date) >= 0) {
            token.setOverdue(CommonUtil.delay(2, 1));
            tokenMapper.save(token);
            return new Result("success", "tokenString");
        } else {
            tokenMapper.delete(token);
            return new Result("failure", "over time");
        }
    }

    public Result login(SysUser user) {
        try {
            if ((user = sysUserMapper.selectOne(user)) != null) {
                //存入token
                String md5s = MD5.md5s(user.getId() + user.getUsername() + user.getPassword());
                Token token = new Token();
                token.setId(sequenceMapper.findOne(3).getNo());
                token.setTokenString(md5s);
                token.setOverdue(CommonUtil.delay(2, 1));
                tokenMapper.save(token);
                return new Result("success", md5s, user);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("error", e.getMessage());
        }
        return new Result("failure", "账户名密码不匹配");
    }
}
