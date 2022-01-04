package com.tyranotyrano.creational.factorymethod.v1.product;

public class Desktop implements Computer {

    @Override
    public String getModelName() {
        return "슈퍼 데스크탑";
    }

    @Override
    public int getPrice() {
        return 5_000_000;
    }
}
