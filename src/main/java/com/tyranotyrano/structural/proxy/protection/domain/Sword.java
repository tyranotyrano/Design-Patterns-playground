package com.tyranotyrano.structural.proxy.protection.domain;

import com.tyranotyrano.structural.proxy.protection.subject.GameItem;

public class Sword implements GameItem {
    private int damage;

    public Sword(int damage) {
        this.damage = damage;
    }

    @Override
    public Grade getGrade() {
        return Grade.NORMAL;
    }

    @Override
    public String getInfo(Authority authority) {
        return authority.name() + " 이(가) [NORMAL] 등급의 \"검\"을 사용합니다. (데미지 : " + damage + ")";
    }
}
