package com.tyranotyrano.behavioral.command.receiver;

public class Boiler {

    public void on() {
        System.out.println("보일러를 켭니다.");
    }

    public void onAuto() {
        System.out.println("자동으로 보일러를 조정합니다.");
    }

    public void off() {
        System.out.println("보일러를 끕니다.");
    }
}
