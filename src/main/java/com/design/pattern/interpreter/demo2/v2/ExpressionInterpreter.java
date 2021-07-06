package com.design.pattern.interpreter.demo2.v2;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yangsanity
 */
public class ExpressionInterpreter {

    public static void main(String[] args) {
        String expression = "8 3 2 4 - + *";
        ExpressionInterpreter e = new ExpressionInterpreter();
        System.out.println(e.interpret(expression));
    }

    private final Deque<Expression> numbers = new LinkedList<>();

    public long interpret(String expression) {
        String[] elements = expression.split(" ");
        int length = elements.length;
        for (int i = 0; i < (length + 1) / 2; ++i) {
            numbers.addLast(new NumberExpression(elements[i]));
        }

        for (int i = (length + 1) / 2; i < length; ++i) {
            String operator = elements[i];
            boolean isValid = "+".equals(operator) || "-".equals(operator)
                    || "*".equals(operator) || "/".equals(operator);
            if (!isValid) {
                throw new RuntimeException("Expression is invalid: " + expression);
            }

            Expression exp1 = numbers.pollFirst();
            Expression exp2 = numbers.pollFirst();
            Expression combinedExp = null;
            if ("+".equals(operator)) {
                combinedExp = new AdditionExpression(exp1, exp2);
            } else if ("-".equals(operator)) {
                combinedExp = new SubtractionExpression(exp1, exp2);
            } else if ("*".equals(operator)) {
                combinedExp = new MultiplicationExpression(exp1, exp2);
            } else if ("/".equals(operator)) {
                combinedExp = new DivisionExpression(exp1, exp2);
            }
            long result = combinedExp.interpret();
            numbers.addFirst(new NumberExpression(result));
        }

        if (numbers.size() != 1) {
            throw new RuntimeException("Expression is invalid: " + expression);
        }

        return numbers.pop().interpret();
    }
}
