package com.tyranotyrano.behavioral.strategy;

import com.tyranotyrano.behavioral.strategy.context.CarMachine;
import com.tyranotyrano.behavioral.strategy.strategy.CarEngineStart;
import com.tyranotyrano.behavioral.strategy.strategy.CarEngineStop;
import com.tyranotyrano.behavioral.strategy.strategy.CarSpeedDown;
import com.tyranotyrano.behavioral.strategy.strategy.CarSpeedUp;

public class StrategyMain {
    public static void main(String[] args) {
        // 0. Context 생성
        CarMachine carMachine = CarMachine.from(new CarEngineStart());
        carMachine.operate();

        // 1. Strategy 변경
        carMachine.changeMoveBehavior(new CarSpeedUp());
        carMachine.operate();

        carMachine.changeMoveBehavior(new CarSpeedDown());
        carMachine.operate();

        carMachine.changeMoveBehavior(new CarEngineStop());
        carMachine.operate();

        System.out.println("==============================");

        // 2. 함수형 인터페이스 사용
        CarMachine funcCarMachine = CarMachine.from(() -> System.out.println("[F-엔진 시동] 자동차 시동을 켭니다."));
        funcCarMachine.operate();

        funcCarMachine.changeMoveBehavior(() -> System.out.println("[F-엑셀] 자동차 속도를 높입니다."));
        funcCarMachine.operate();

        funcCarMachine.changeMoveBehavior(() -> System.out.println("[F-브레이크] 자동차 속도를 줄입니다."));
        funcCarMachine.operate();

        funcCarMachine.changeMoveBehavior(() -> System.out.println("[F-엔진 끄기] 자동차 시동을 끕니다."));
        funcCarMachine.operate();
    }
}
