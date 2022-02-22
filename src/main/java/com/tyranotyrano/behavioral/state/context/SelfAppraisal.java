package com.tyranotyrano.behavioral.state.context;

import com.tyranotyrano.behavioral.state.state.AppraisalReady;
import com.tyranotyrano.behavioral.state.state.AppraisalState;

public class SelfAppraisal {
    private AppraisalState appraisalState;

    private SelfAppraisal() {
        this.appraisalState = new AppraisalReady();
        this.appraisalState.printCurrentState();
    }

    public static SelfAppraisal create() {
        return new SelfAppraisal();
    }

    public void proceed() {
        this.appraisalState = this.appraisalState.completeStep();
        this.appraisalState.printCurrentState();
    }
}
