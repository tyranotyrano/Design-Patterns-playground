package com.tyranotyrano.behavioral.memento.caretaker;

import java.util.ArrayList;
import java.util.List;

import com.tyranotyrano.behavioral.memento.memento.CodeSnapshot;

public class CodeCareTaker {
    private List<CodeSnapshot> codeSnapshots = new ArrayList<>();

    public void add(CodeSnapshot codeSnapshot) {
        codeSnapshots.add(codeSnapshot);
    }

    public void printAll() {
        for (CodeSnapshot codeSnapshot : codeSnapshots) {
            System.out.println(codeSnapshot.getInfo());
        }
    }

}
