package com.itcast.factory;

import com.itcast.service.IUserService;
import com.itcast.service.impl.UserServiceImpl;

public class ServiceFactory {

    public IUserService getInstance(){
        return new UserServiceImpl();
    }

}
