package com.itcast.factory;

public class Productor implements Computer {


    public String sale(double money){
        System.out.println("花了"+money+"元买电脑");
        return "联想电脑";
    }
    public void show(){
        System.out.println("展示联想电脑");
    }
}
