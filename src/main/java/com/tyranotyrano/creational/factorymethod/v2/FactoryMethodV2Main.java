package com.tyranotyrano.creational.factorymethod.v2;

import com.tyranotyrano.creational.factorymethod.v2.creator.ComputerV2Type;
import com.tyranotyrano.creational.factorymethod.v2.creator.ComputerV2Creator;
import com.tyranotyrano.creational.factorymethod.v2.product.ComputerV2;

public class FactoryMethodV2Main {

    public static void main(String[] args) {
        // 1. 데스크탑
        ComputerV2 desktop = ComputerV2Creator.createComputer(ComputerV2Type.DESKTOP);
        System.out.println(desktop.getInfo());

        // 2. 노트북
        ComputerV2 notebook = ComputerV2Creator.createComputer(ComputerV2Type.NOTEBOOK);
        System.out.println(notebook.getInfo());
    }
}
