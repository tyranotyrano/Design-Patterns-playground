package com.tyranotyrano.structural.flyweight.flyweight;

public class Firebat extends BionicUnit {
    private boolean isSplashDamage;

    private Firebat(String name, int coast, boolean isSplashDamage) {
        super(name, coast);
        this.isSplashDamage = isSplashDamage;
    }

    public static Firebat of(String name, int coast, boolean isSplashDamage) {
        return new Firebat(name, coast, isSplashDamage);
    }

    public void onSplashDamage() {
        isSplashDamage = true;
    }

    @Override
    public void useSkill() {
        System.out.println("화염방사기를 난사한다.");
    }

    @Override
    public void printInfo() {
        System.out.println("name : " + getName() + ", coast : " + getCoast() + ", isSplashDamage : " + isSplashDamage);
    }
}
