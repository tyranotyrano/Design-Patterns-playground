package com.tyranotyrano.creational.factorymethod.v2.product;

public class NotebookV2 implements ComputerV2 {

    @Override
    public String getModelName() {
        return "LG 그램 노트북";
    }

    @Override
    public int getPrice() {
        return 500_000;
    }
}
