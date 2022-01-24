package com.tyranotyrano.structural.decorator.component;

public abstract class TextComponent {
    protected String text;

    protected TextComponent(String text) {
        this.text = text;
    }

    public abstract String getText();
}
