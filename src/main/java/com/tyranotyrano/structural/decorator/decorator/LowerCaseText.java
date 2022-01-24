package com.tyranotyrano.structural.decorator.decorator;

import com.tyranotyrano.structural.decorator.component.TextComponent;

public class LowerCaseText extends TextDecorator {

    public LowerCaseText(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getText() {
        String text = super.getText();
        System.out.println("LowerCase 전 : " + text);

        return text.toLowerCase();
    }
}
