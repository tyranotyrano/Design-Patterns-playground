package com.tyranotyrano.behavioral.strategy.strategy;

public class CarEngineStart implements CarMoveBehavior {

    @Override
    public void action() {
        System.out.println("[엔진 시동] 자동차 시동을 켭니다.");
    }
}
