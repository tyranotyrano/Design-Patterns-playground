package com.tyranotyrano.behavioral.observer.v2.subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ConcreteSubject extends Observable {
    private List<Observer> observers = new ArrayList<>();

    public void notifyMessage(String message) {
        setChanged();
        notifyObservers(message);
    }
}
