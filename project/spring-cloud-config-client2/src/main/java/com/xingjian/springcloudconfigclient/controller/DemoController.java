package com.xingjian.springcloudconfigclient.controller;

import com.xingjian.springcloudconfigclient.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    @Qualifier("user2Impl")
    IUser user;

    @RequestMapping("/getName")
    public String getName() {
        return user.getName();
    }
}
