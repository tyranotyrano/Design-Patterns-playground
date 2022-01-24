package com.tyranotyrano.structural.decorator;

import com.tyranotyrano.structural.decorator.component.English;
import com.tyranotyrano.structural.decorator.component.TextComponent;
import com.tyranotyrano.structural.decorator.decorator.LowerCaseText;
import com.tyranotyrano.structural.decorator.decorator.UpperCaseText;

public class DecoratorMain {

    public static void main(String[] args) {
        // 0. ConcreteComponent 생성
        TextComponent english = new English("ABC def");

        // 1. Decorator 1 : 원본 -> 모두 대문자로 바꾸기
        TextComponent upperCase = new UpperCaseText(english);
        System.out.println(upperCase.getText());
        System.out.println();

        // 1-1. Decorator 2 : 원본 -> 모두 소문자로 바꾸기
        TextComponent lowerCase = new LowerCaseText(english);
        System.out.println(lowerCase.getText());
        System.out.println();

        // 2. Decorator 1 + 2 : (원본 -> 모두 대문자로 바꾸기) -> 모두 소문자로 바꾸기
        TextComponent upperLowerCase = new LowerCaseText(upperCase);
        System.out.println(upperLowerCase.getText());
    }
}
