package com.tyranotyrano.structural.flyweight.flyweight;

public abstract class    BionicUnit {
    private String name;
    private int coast;

    protected BionicUnit(String name, int coast) {
        this.name = name;
        this.coast = coast;
    }

    public abstract void useSkill();

    public abstract void printInfo();

    public String getName() {
        return name;
    }

    public int getCoast() {
        return coast;
    }
}
