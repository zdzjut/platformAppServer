package com.boot.druid.controller;

import com.boot.druid.model.busRegistered.BusRegistered;
import com.boot.druid.service.BusRegisteredService;
import com.boot.druid.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RequestMapping("app")
@RestController
public class BusRegisteredController {

    @Resource
    private BusRegisteredService busRegisteredService;


    @RequestMapping(value = "check", produces = "application/json;charset=UTF-8")
    public Result check(String token) {
        return busRegisteredService.checkToken(token);
    }

    @RequestMapping(value = "login", produces = "application/json;charset=UTF-8")
    public Result login(BusRegistered user) {
        return busRegisteredService.login(user);
    } @RequestMapping(value = "error", produces = "application/json;charset=UTF-8")
    public Result error() {
        return new Result("failure","非法访问");
    }
}
