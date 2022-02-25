package com.tyranotyrano.behavioral.state.state;

import com.tyranotyrano.behavioral.state.context.SelfAppraisal;

public class AppraisalReady implements AppraisalState {

    @Override
    public void completeStep(SelfAppraisal selfAppraisal) {
        selfAppraisal.changeState(new AppraisalStart());
    }

    @Override
    public void printCurrentState() {
        System.out.println("[평가 준비] 평가 할 준비가 되었습니다.");
    }
}
