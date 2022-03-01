package com.tyranotyrano.behavioral.templatemethod.template;

public abstract class ContentRecorder {
    private String prefix;

    protected ContentRecorder(String prefix) {
        this.prefix = prefix;
    }

    protected abstract String getParsedContents(String contents);

    public void record(String manager, String contents) {
        String parsedContents = getParsedContents(contents);
        System.out.println("["+ this.prefix + "] " + manager + "가 \"" + parsedContents + "\" 내용을 기록하였습니다.");
    }
}
