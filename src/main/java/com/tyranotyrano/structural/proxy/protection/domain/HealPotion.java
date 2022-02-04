package com.tyranotyrano.structural.proxy.protection.domain;

import com.tyranotyrano.structural.proxy.protection.subject.GameItem;

public class HealPotion implements GameItem {
    private String effect;

    public HealPotion(String effect) {
        this.effect = effect;
    }

    @Override
    public Grade getGrade() {
        return Grade.NORMAL;
    }

    @Override
    public String getInfo(Authority authority) {
        return authority.name() + " 이(가) [NORMAL] 등급의 \"물약\"을 사용합니다. (효과 : " + effect + ")";
    }
}
