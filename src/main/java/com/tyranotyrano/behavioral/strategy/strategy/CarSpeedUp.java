package com.tyranotyrano.behavioral.strategy.strategy;

public class CarSpeedUp implements CarMoveBehavior {

    @Override
    public void action() {
        System.out.println("[엑셀] 자동차 속도를 높입니다.");
    }
}
