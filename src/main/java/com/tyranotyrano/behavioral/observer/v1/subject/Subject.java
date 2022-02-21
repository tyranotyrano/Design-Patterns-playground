package com.tyranotyrano.behavioral.observer.v1.subject;

import com.tyranotyrano.behavioral.observer.v1.observer.Observer;

public interface Subject {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObserver(String message);
}
