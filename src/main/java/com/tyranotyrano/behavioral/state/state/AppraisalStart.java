package com.tyranotyrano.behavioral.state.state;

public class AppraisalStart implements AppraisalState {

    @Override
    public AppraisalState completeStep() {
        return new AppraisalDone();
    }

    @Override
    public void printCurrentState() {
        System.out.println("[평가 시작] 평가를 시작합니다.");
    }
}
