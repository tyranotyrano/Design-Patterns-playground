package com.tyranotyrano.behavioral.observer.v2;

import com.tyranotyrano.behavioral.observer.v2.observer.ConcreteObserver;
import com.tyranotyrano.behavioral.observer.v2.subject.ConcreteSubject;

public class ObserverV2Main {
    public static void main(String[] args) {
        // 0. Subject 생성
        ConcreteSubject concreteSubject = new ConcreteSubject();

        // 1. Observer 추가
        concreteSubject.addObserver(new ConcreteObserver("AAA"));
        concreteSubject.addObserver(new ConcreteObserver("BBB"));
        concreteSubject.addObserver(new ConcreteObserver("CCC"));

        // 2. Subject 상태 변경
        concreteSubject.notifyMessage("[Subject -> Observer] 메세지 전달");
    }
}
