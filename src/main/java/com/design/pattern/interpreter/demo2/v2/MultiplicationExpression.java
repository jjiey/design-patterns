package com.design.pattern.interpreter.demo2.v2;

/**
 * 运算符 *
 *
 * @author yangsanity
 */
public class MultiplicationExpression implements Expression {

    private final Expression exp1;
    private final Expression exp2;

    public MultiplicationExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public long interpret() {
        return exp1.interpret() * exp2.interpret();
    }
}
