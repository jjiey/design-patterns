package com.design.pattern.Decorator.example;

public class BigTrouser extends Finery {

    @Override
    public void show() {
        super.show();
        System.out.println("垮裤");
    }
}
