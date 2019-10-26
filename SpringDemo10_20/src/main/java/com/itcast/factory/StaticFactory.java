package com.itcast.factory;

import com.itcast.service.IUserService;
import com.itcast.service.impl.UserServiceImpl;

public class StaticFactory {
    public static IUserService getInstance(){
        return new UserServiceImpl();
    }
}
