package com.tyranotyrano.behavioral.observer.v1.observer;

public class Leader implements Observer{
    private String name;
    private String job;

    private Leader(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public static Leader of(String name, String job) {
        return new Leader(name, job);
    }

    @Override
    public void receive(String message) {
        System.out.println("[" + this.name + "-수신] " + message);
    }
}
