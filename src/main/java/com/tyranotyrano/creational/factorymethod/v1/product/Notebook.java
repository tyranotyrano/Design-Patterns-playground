package com.tyranotyrano.creational.factorymethod.v1.product;

public class Notebook implements Computer {

    @Override
    public String getModelName() {
        return "삼성 노트북";
    }

    @Override
    public int getPrice() {
        return 1_000_000;
    }
}
