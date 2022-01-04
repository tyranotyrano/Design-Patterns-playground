package com.tyranotyrano.creational.factorymethod.v3.creator;

import com.tyranotyrano.creational.factorymethod.v3.product.ComputerV3;
import com.tyranotyrano.creational.factorymethod.v3.product.NotebookV3;

public class NotebookV3Creator extends ComputerV3Creator {

    @Override
    protected ComputerV3 createComputer() {
        return new NotebookV3();
    }
}
