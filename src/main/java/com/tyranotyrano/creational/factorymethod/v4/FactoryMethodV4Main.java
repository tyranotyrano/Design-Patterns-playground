package com.tyranotyrano.creational.factorymethod.v4;

import com.tyranotyrano.creational.factorymethod.v4.creator.ComputerV4Creator;
import com.tyranotyrano.creational.factorymethod.v4.creator.GenericComputerV4Creator;
import com.tyranotyrano.creational.factorymethod.v4.product.ComputerV4;
import com.tyranotyrano.creational.factorymethod.v4.product.DesktopV4;
import com.tyranotyrano.creational.factorymethod.v4.product.NotebookV4;

public class FactoryMethodV4Main {

    public static void main(String[] args) {
        // 1. 데스크탑
        ComputerV4Creator desktopCreator = new GenericComputerV4Creator(DesktopV4.class);
        ComputerV4 desktop = desktopCreator.newComputer();
        System.out.println(desktop.getInfo());

        // 2. 노트북
        ComputerV4Creator notebookCreator = new GenericComputerV4Creator(NotebookV4.class);
        ComputerV4 notebook = notebookCreator.newComputer();
        System.out.println(notebook.getInfo());
    }
}
