package com.tyranotyrano.creational.factorymethod.v1;

import com.tyranotyrano.creational.factorymethod.v1.creator.ComputerCreator;
import com.tyranotyrano.creational.factorymethod.v1.creator.DesktopCreator;
import com.tyranotyrano.creational.factorymethod.v1.creator.NotebookCreator;
import com.tyranotyrano.creational.factorymethod.v1.product.Computer;

public class FactoryMethodV1Main {

    public static void main(String[] args) {
        // 1. 데스크탑
        ComputerCreator desktopCreator = new DesktopCreator();
        Computer desktop = desktopCreator.newComputer();
        System.out.println(desktop.getInfo());

        // 2. 노트북
        ComputerCreator notebookCreator = new NotebookCreator();
        Computer notebook = notebookCreator.newComputer();
        System.out.println(notebook.getInfo());
    }
}
