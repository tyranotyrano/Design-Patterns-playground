package com.tyranotyrano.behavioral.memento;

import com.tyranotyrano.behavioral.memento.caretaker.CodeCareTaker;
import com.tyranotyrano.behavioral.memento.originator.BasicCode;
import com.tyranotyrano.behavioral.memento.originator.LevelCode;

public class MementoMain {

    public static void main(String[] args) {
        // 0. Originator 생성
        BasicCode genderCode = BasicCode.of("남자", "G01");
        LevelCode jobPositionCode = LevelCode.of("JP01", "사장", 1);

        // 1. CareTaker 생성
        CodeCareTaker codeCareTaker = new CodeCareTaker();

        // 2. Memento 생성
        System.out.println("1. 변경 전 ==================");
        codeCareTaker.add(genderCode.createSnapshot());
        codeCareTaker.add(jobPositionCode.createSnapshot());
        codeCareTaker.printAll();

        genderCode.changeName("여자");
        jobPositionCode.changeLevel(100);

        System.out.println("2. 변경 후 ==================");
        codeCareTaker.add(genderCode.createSnapshot());
        codeCareTaker.add(jobPositionCode.createSnapshot());
        codeCareTaker.printAll();
    }
}
