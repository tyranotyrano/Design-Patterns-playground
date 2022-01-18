package com.tyranotyrano.structural.bridge.abstraction;

import com.tyranotyrano.structural.bridge.implementor.SpecialSkill;

public class Attacker extends GameCharacter {

    public Attacker(SpecialSkill specialSkill) {
        super(specialSkill);
    }

    @Override
    public void useNormalSkill() {
        System.out.println("[어태커] 적을 공격합니다.");
    }
}
