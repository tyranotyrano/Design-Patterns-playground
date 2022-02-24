package com.tyranotyrano.behavioral.strategy;

import com.tyranotyrano.behavioral.strategy.context.CarMachine;
import com.tyranotyrano.behavioral.strategy.strategy.CarEngineStart;
import com.tyranotyrano.behavioral.strategy.strategy.CarEngineStop;
import com.tyranotyrano.behavioral.strategy.strategy.CarSpeedDown;
import com.tyranotyrano.behavioral.strategy.strategy.CarSpeedUp;

public class StrategyMain {
    public static void main(String[] args) {
        // 0. Context 생성
        CarMachine carMachine = new CarMachine();

        // 1. Strategy 주입
        carMachine.operate(new CarEngineStart());
        carMachine.operate(new CarSpeedUp());
        carMachine.operate(new CarSpeedDown());
        carMachine.operate(new CarEngineStop());

        System.out.println("==============================");

        // 2. 함수형 인터페이스 사용
        CarMachine funcCarMachine = new CarMachine();

        funcCarMachine.operate(() -> System.out.println("[F-엔진 시동] 자동차 시동을 켭니다."));
        funcCarMachine.operate(() -> System.out.println("[F-엑셀] 자동차 속도를 높입니다."));
        funcCarMachine.operate(() -> System.out.println("[F-브레이크] 자동차 속도를 줄입니다."));
        funcCarMachine.operate(() -> System.out.println("[F-엔진 끄기] 자동차 시동을 끕니다."));
    }
}
