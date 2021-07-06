package com.design.pattern.interpreter.demo2.v1;

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

    private final Deque<Long> numbers = new LinkedList<>();

    public long interpret(String expression) {
        String[] elements = expression.split(" ");
        int length = elements.length;
        for (int i = 0; i < (length + 1) / 2; ++i) {
            numbers.addLast(Long.parseLong(elements[i]));
        }

        for (int i = (length + 1) / 2; i < length; ++i) {
            String operator = elements[i];
            boolean isValid = "+".equals(operator) || "-".equals(operator)
                    || "*".equals(operator) || "/".equals(operator);
            if (!isValid) {
                throw new RuntimeException("Expression is invalid: " + expression);
            }

            long number1 = numbers.pollFirst();
            long number2 = numbers.pollFirst();
            long result = 0;
            if ("+".equals(operator)) {
                result = number1 + number2;
            } else if ("-".equals(operator)) {
                result = number1 - number2;
            } else if ("*".equals(operator)) {
                result = number1 * number2;
            } else if ("/".equals(operator)) {
                result = number1 / number2;
            }
            numbers.addFirst(result);
        }

        if (numbers.size() != 1) {
            throw new RuntimeException("Expression is invalid: " + expression);
        }

        return numbers.pop();
    }
}
