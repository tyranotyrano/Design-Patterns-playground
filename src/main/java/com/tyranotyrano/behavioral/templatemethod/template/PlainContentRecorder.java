package com.tyranotyrano.behavioral.templatemethod.template;

public class PlainContentRecorder extends ContentRecorder {

    public PlainContentRecorder(String prefix) {
        super(prefix);
    }

    @Override
    protected String getParsedContents(String contents) {
        return contents;
    }
}
