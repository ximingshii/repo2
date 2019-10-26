package com.itcast.service.impl;

import com.itcast.service.IUserService;
import org.springframework.stereotype.Component;

@Component()
public class UserServiceImpl implements IUserService {
    String userName;
    Integer password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public void run(){

        System.out.println("run方法运行了");
    } public void init(){
        System.out.println("创建方法运行了");
    } public void destory(){
        System.out.println("销魂方法运行了");
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                '}';
    }
}
