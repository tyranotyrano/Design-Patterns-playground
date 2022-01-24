package com.tyranotyrano.structural.flyweight;

import com.tyranotyrano.structural.flyweight.factory.Barracks;
import com.tyranotyrano.structural.flyweight.flyweight.BionicUnit;
import com.tyranotyrano.structural.flyweight.flyweight.BionicUnitType;
import com.tyranotyrano.structural.flyweight.flyweight.Firebat;
import com.tyranotyrano.structural.flyweight.flyweight.Marine;
import com.tyranotyrano.structural.flyweight.flyweight.Medic;

public class FlyweightMain {

    public static void main(String[] args) {
        // 1. 마린, 파이어뱃, 메딕 최초 생성
        BionicUnit marine1 = Barracks.getUnit(BionicUnitType.MARINE);
        BionicUnit firebat1 = Barracks.getUnit(BionicUnitType.FIREBAT);
        BionicUnit medic1 = Barracks.getUnit(BionicUnitType.MEDIC);

        marine1.printInfo();
        firebat1.printInfo();
        medic1.printInfo();

        System.out.println();

        // 2. 마린, 파이어뱃, 메딕 재생성
        BionicUnit marine2 = Barracks.getUnit(BionicUnitType.MARINE);
        BionicUnit firebat2 = Barracks.getUnit(BionicUnitType.FIREBAT);
        BionicUnit medic2 = Barracks.getUnit(BionicUnitType.MEDIC);

        ((Marine) marine2).onStimpack();
        ((Firebat) firebat2).onSplashDamage();
        ((Medic) medic2).emptyMana();

        marine2.printInfo();
        firebat2.printInfo();
        medic2.printInfo();
    }
}
