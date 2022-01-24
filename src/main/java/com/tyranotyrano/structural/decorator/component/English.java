package com.tyranotyrano.structural.decorator.component;

public class English extends TextComponent {

    public English(String text) {
        super(text);
    }

    @Override
    public String getText() {
        return this.text;
    }
}
