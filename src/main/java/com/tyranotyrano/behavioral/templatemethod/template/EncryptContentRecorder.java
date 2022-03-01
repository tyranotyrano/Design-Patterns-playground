package com.tyranotyrano.behavioral.templatemethod.template;

public class EncryptContentRecorder extends ContentRecorder {

    public EncryptContentRecorder(String prefix) {
        super(prefix);
    }

    @Override
    protected String getParsedContents(String contents) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < contents.length(); i++) {
            sb.append("*");
        }

        return sb.toString();
    }
}
