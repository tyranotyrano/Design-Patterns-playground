package com.tyranotyrano.creational.factorymethod.v3;

import com.tyranotyrano.creational.factorymethod.v3.creator.ComputerV3Creator;
import com.tyranotyrano.creational.factorymethod.v3.creator.DesktopV3Creator;
import com.tyranotyrano.creational.factorymethod.v3.creator.NotebookV3Creator;
import com.tyranotyrano.creational.factorymethod.v3.product.ComputerV3;

public class FactoryMethodV3Main {

    public static void main(String[] args) {
        // 1. 데스크탑
        ComputerV3Creator desktopCreator = new DesktopV3Creator();
        ComputerV3 desktop = desktopCreator.newComputer();
        System.out.println(desktop.getInfo());

        // 2. 노트북
        ComputerV3Creator notebookCreator = new NotebookV3Creator();
        ComputerV3 notebook = notebookCreator.newComputer();
        System.out.println(notebook.getInfo());
    }
}
