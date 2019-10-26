package com.itcast.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxy {



    public static void main(String[] args) {
        Productor productor= new Productor();
        Proxy.newProxyInstance(Productor.class.getClassLoader(), productor.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getName().equals("sale")){
                   method.invoke(productor,args);
                }
                return null;
            }
        });
    }
}
