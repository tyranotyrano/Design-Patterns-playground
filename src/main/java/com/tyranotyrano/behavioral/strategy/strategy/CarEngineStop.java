package com.tyranotyrano.behavioral.strategy.strategy;

public class CarEngineStop implements CarMoveBehavior {

    @Override
    public void action() {
        System.out.println("[엔진 끄기] 자동차 시동을 끕니다.");
    }
}
