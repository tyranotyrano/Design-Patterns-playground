package com.tyranotyrano.behavioral.observer.v2.observer;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.name + " 가 수신함 : " + arg.toString());
    }
}
