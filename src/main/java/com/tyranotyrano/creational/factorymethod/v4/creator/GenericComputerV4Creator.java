package com.tyranotyrano.creational.factorymethod.v4.creator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.tyranotyrano.creational.factorymethod.v4.product.ComputerV4;

public class GenericComputerV4Creator<T extends ComputerV4> extends ComputerV4Creator {
    private final Class<T> cls;

    public GenericComputerV4Creator(Class<T> cls) {
        this.cls = cls;
    }

    @Override
    protected ComputerV4 createComputer() {
        T computer = null;

        try {
            Constructor<T> constructor = cls.getConstructor();
            computer = constructor.newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return computer;
    }
}
