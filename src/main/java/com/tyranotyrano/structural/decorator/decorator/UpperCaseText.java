package com.tyranotyrano.structural.decorator.decorator;

import com.tyranotyrano.structural.decorator.component.TextComponent;

public class UpperCaseText extends TextDecorator {

    public UpperCaseText(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getText() {
        String text = super.getText();
        System.out.println("UpperCase 전 : " + text);

        return text.toUpperCase();
    }
}
