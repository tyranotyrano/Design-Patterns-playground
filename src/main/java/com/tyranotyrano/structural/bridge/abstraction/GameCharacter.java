package com.tyranotyrano.structural.bridge.abstraction;

import com.tyranotyrano.structural.bridge.implementor.SpecialSkill;

public abstract class GameCharacter {
    private SpecialSkill specialSkill;

    protected GameCharacter(SpecialSkill specialSkill) {
        this.specialSkill = specialSkill;
    }

    public abstract void useNormalSkill();

    public void useSpecialSkill() {
        specialSkill.use();
    }
}
