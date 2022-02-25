package com.tyranotyrano.behavioral.state.state;

import com.tyranotyrano.behavioral.state.context.SelfAppraisal;

public class AppraisalStart implements AppraisalState {

    @Override
    public void completeStep(SelfAppraisal selfAppraisal) {
        selfAppraisal.changeState(new AppraisalDone());
    }

    @Override
    public void printCurrentState() {
        System.out.println("[평가 시작] 평가를 시작합니다.");
    }
}
