package com.tyranotyrano.behavioral.templatemethod;

import com.tyranotyrano.behavioral.templatemethod.template.ContentRecorder;
import com.tyranotyrano.behavioral.templatemethod.template.EncryptContentRecorder;
import com.tyranotyrano.behavioral.templatemethod.template.PlainContentRecorder;

public class TemplateMethodMain {
    public static void main(String[] args) {
        // 0. 템플릿 메서드를 가진 객체 생성
        ContentRecorder plainContentRecorder = new PlainContentRecorder("PLAIN");
        ContentRecorder encryptContentRecorder = new EncryptContentRecorder("ENCRYPT");

        // 1. 템플릿 메서드 실행
        plainContentRecorder.record("관리자A", "공개 내용입니다.");
        encryptContentRecorder.record("관리자B", "기밀 내용입니다.");
    }
}
