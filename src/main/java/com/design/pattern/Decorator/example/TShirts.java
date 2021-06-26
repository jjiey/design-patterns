package com.design.pattern.Decorator.example;

public class TShirts extends Finery {

    @Override
    public void show() {
        super.show();
        System.out.println("大T恤");
    }
}
