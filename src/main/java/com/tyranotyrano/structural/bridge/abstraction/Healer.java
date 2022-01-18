package com.tyranotyrano.structural.bridge.abstraction;

import com.tyranotyrano.structural.bridge.implementor.SpecialSkill;

public class Healer extends GameCharacter {

    public Healer(SpecialSkill specialSkill) {
        super(specialSkill);
    }

    @Override
    public void useNormalSkill() {
        System.out.println("[힐러] 동료를 치료합니다.");
    }
}
