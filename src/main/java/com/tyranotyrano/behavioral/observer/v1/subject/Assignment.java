package com.tyranotyrano.behavioral.observer.v1.subject;

import java.util.ArrayList;
import java.util.List;

import com.tyranotyrano.behavioral.observer.v1.observer.Observer;

public class Assignment implements Subject {
    private String name;
    private String goal;
    private String plan;
    private Observer owner;
    private List<Observer> observers = new ArrayList<>();

    private Assignment(String name, String goal, String plan, Observer owner) {
        this.name = name;
        this.goal = goal;
        this.plan = plan;
        this.owner = owner;
    }

    public static Assignment of(String name, String goal, String plan, Observer owner) {
        return new Assignment(name, goal, plan, owner);
    }

    @Override
    public void addObserver(Observer observer) {
        if (this.owner.equals(observer)) {
            return;
        }

        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer observer : observers) {
            observer.receive(message);
        }
    }

    public void changeGoal(String goal) {
        this.goal = goal;
        notifyObserver("목표가 " + this.goal + " 로 변경되었습니다.");
    }

    public void changePlan(String plan) {
        this.plan = plan;
        notifyObserver("계획이 " + this.plan + " 로 변경되었습니다.");
    }
}
