package com.design.pattern.memento.demo2.v1;

/**
 * @author yangsanity
 */
public class InputText {

    private StringBuilder text = new StringBuilder();

    public void append(String input) {
        this.text.append(input);
    }

    public String getText() {
        return this.text.toString();
    }

    public void setText(String text) {
        this.text.replace(0, this.text.length(), text);
    }
}
