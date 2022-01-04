package com.tyranotyrano.creational.factorymethod.v4.product;

public class NotebookV4 implements ComputerV4 {

    @Override
    public String getModelName() {
        return "한성 노트북";
    }

    @Override
    public int getPrice() {
        return 1_500_000;
    }
}
