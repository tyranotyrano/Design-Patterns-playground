package com.tyranotyrano.behavioral.state.state;

public class AppraisalReady implements AppraisalState {

    @Override
    public AppraisalState completeStep() {
        return new AppraisalStart();
    }

    @Override
    public void printCurrentState() {
        System.out.println("[평가 준비] 평가 할 준비가 되었습니다.");
    }
}
