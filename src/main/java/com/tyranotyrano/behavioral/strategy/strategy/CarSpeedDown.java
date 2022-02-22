package com.tyranotyrano.behavioral.strategy.strategy;

public class CarSpeedDown implements CarMoveBehavior {

    @Override
    public void action() {
        System.out.println("[브레이크] 자동차 속도를 줄입니다.");
    }
}
