package com.tyranotyrano.behavioral.command.receiver;

public class AirConditioner {

    public void on() {
        System.out.println("에어컨을 켭니다.");
    }

    public void onPowerful() {
        System.out.println("강력모드로 에어컨을 가동합니다.");
    }

    public void off() {
        System.out.println("에어컨을 끕니다.");
    }
}
