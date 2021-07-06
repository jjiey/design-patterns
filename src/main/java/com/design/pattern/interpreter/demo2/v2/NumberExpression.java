package com.design.pattern.interpreter.demo2.v2;

/**
 * 数字
 *
 * @author yangsanity
 */
public class NumberExpression implements Expression {

    private final long number;

    public NumberExpression(long number) {
        this.number = number;
    }

    public NumberExpression(String number) {
        this.number = Long.parseLong(number);
    }

    @Override
    public long interpret() {
        return this.number;
    }
}
