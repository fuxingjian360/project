package com.xingjian.springcloudconfigclient.service.impl;

import com.xingjian.springcloudconfigclient.service.IUser;
import org.springframework.stereotype.Service;

@Service
public class User2Impl implements IUser {
    @Override
    public String getName() {
        return "User2Impl.getName()";
    }
}
