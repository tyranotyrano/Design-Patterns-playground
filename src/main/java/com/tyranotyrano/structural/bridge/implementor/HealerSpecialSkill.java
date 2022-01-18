package com.tyranotyrano.structural.bridge.implementor;

public class HealerSpecialSkill implements SpecialSkill {

    @Override
    public void use() {
        System.out.println("[힐러] 죽은 동료를 부활시킵니다.");
    }
}
