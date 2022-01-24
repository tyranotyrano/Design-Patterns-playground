package com.tyranotyrano.structural.flyweight.flyweight;

public class Marine extends BionicUnit {
    private boolean isStimpack;

    private Marine(String name, int coast, boolean isStimpack) {
        super(name, coast);
        this.isStimpack = isStimpack;
    }

    public static Marine of(String name, int coast, boolean isStimpack) {
        return new Marine(name, coast, isStimpack);
    }

    public void onStimpack() {
        isStimpack = true;
    }

    @Override
    public void useSkill() {
        System.out.println("총을 난사한다.");
    }

    @Override
    public void printInfo() {
        System.out.println("name : " + getName() + ", coast : " + getCoast() + ", isStimpack : " + isStimpack);
    }
}
