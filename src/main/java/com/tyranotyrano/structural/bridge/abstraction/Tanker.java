package com.tyranotyrano.structural.bridge.abstraction;

import com.tyranotyrano.structural.bridge.implementor.SpecialSkill;

public class Tanker extends GameCharacter {

    public Tanker(SpecialSkill specialSkill) {
        super(specialSkill);
    }

    @Override
    public void useNormalSkill() {
        System.out.println("[탱커] 동료대신 몸빵을 합니다.");
    }
}
