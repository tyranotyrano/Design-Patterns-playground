package com.tyranotyrano.structural.decorator.decorator;

import com.tyranotyrano.structural.decorator.component.TextComponent;

public abstract class TextDecorator extends TextComponent {
    private TextComponent textComponent;

    protected TextDecorator(TextComponent textComponent) {
        super("");
        this.textComponent = textComponent;
    }

    @Override
    public String getText() {
        return textComponent.getText();
    }
}
