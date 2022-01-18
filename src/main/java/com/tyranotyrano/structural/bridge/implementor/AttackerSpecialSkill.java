package com.tyranotyrano.structural.bridge.implementor;

public class AttackerSpecialSkill implements SpecialSkill {

    @Override
    public void use() {
        System.out.println("[어태커] 적에게 에너지파를 쏩니다.");
    }
}
