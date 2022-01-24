package com.tyranotyrano.structural.flyweight.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.tyranotyrano.structural.flyweight.flyweight.BionicUnit;
import com.tyranotyrano.structural.flyweight.flyweight.BionicUnitType;
import com.tyranotyrano.structural.flyweight.flyweight.Firebat;
import com.tyranotyrano.structural.flyweight.flyweight.Marine;
import com.tyranotyrano.structural.flyweight.flyweight.Medic;

public class Barracks {
    private static final Map<BionicUnitType, BionicUnit> unitDict = new HashMap<>();

    private Barracks() {}

    public static BionicUnit getUnit(BionicUnitType unitType) {
        BionicUnit bionicUnit = unitDict.get(unitType);

        if (Objects.isNull(bionicUnit)) {
            bionicUnit = createUnit(unitType);
            unitDict.put(unitType, bionicUnit);
        }

        return bionicUnit;
    }

    private static BionicUnit createUnit(BionicUnitType unitType) {
        System.out.println("[" + unitType + "]" + "타입 새로운 객체 생성");

        switch (unitType) {
            case MARINE:
                return Marine.of("마린", 10, false);
            case FIREBAT:
                return Firebat.of("파이어뱃", 20, false);
            case MEDIC:
                return Medic.of("메딕", 30, 1000);
            default:
                throw new RuntimeException();
        }
    }
}
