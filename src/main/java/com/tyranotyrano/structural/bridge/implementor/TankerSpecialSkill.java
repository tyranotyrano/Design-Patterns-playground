package com.tyranotyrano.structural.bridge.implementor;

public class TankerSpecialSkill implements SpecialSkill {

    @Override
    public void use() {
        System.out.println("[탱커] 방어력이 200% 상승합니다.");
    }
}
