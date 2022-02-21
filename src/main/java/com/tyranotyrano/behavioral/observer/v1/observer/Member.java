package com.tyranotyrano.behavioral.observer.v1.observer;

public class Member implements Observer {
    private String name;
    private String job;

    private Member(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public static Member of(String name, String job) {
        return new Member(name, job);
    }

    @Override
    public void receive(String message) {
        System.out.println(message);
    }
}
