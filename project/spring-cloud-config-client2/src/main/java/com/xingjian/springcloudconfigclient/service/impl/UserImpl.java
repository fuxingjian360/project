package com.xingjian.springcloudconfigclient.service.impl;

import com.xingjian.springcloudconfigclient.service.IUser;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements IUser {
    @Override
    public String getName() {
        return "UserImpl.getName()";
    }
}
