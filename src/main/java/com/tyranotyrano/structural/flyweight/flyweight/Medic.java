package com.tyranotyrano.structural.flyweight.flyweight;

public class Medic extends BionicUnit {
    private int totalMana;

    private Medic(String name, int coast, int totalMana) {
        super(name, coast);
        this.totalMana = totalMana;
    }

    public static Medic of(String name, int coast, int totalMana) {
        return new Medic(name, coast, totalMana);
    }

    public void emptyMana() {
        this.totalMana = 0;
    }

    @Override
    public void useSkill() {
        System.out.println("주변 동료를 치료한다.");
    }

    @Override
    public void printInfo() {
        System.out.println("name : " + getName() + ", coast : " + getCoast() + ", totalMana : " + totalMana);
    }
}
