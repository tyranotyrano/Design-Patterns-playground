package com.tyranotyrano.creational.factorymethod.v3.product;

public class NotebookV3 implements ComputerV3 {

    @Override
    public String getModelName() {
        return "맥북 프로";
    }

    @Override
    public int getPrice() {
        return 3_000_000;
    }
}
