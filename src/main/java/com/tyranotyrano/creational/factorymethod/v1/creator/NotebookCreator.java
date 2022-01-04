package com.tyranotyrano.creational.factorymethod.v1.creator;

import com.tyranotyrano.creational.factorymethod.v1.product.Computer;
import com.tyranotyrano.creational.factorymethod.v1.product.Notebook;

public class NotebookCreator extends ComputerCreator {

    @Override
    protected Computer createComputer() {
        return new Notebook();
    }
}
