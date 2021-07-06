package com.design.pattern.interpreter.demo3;

import java.util.Map;

/**
 * @author yangsanity
 */
public class LessExpression implements Expression {

    private final String key;
    private final long value;

    public LessExpression(String strExpression) {
        String[] elements = strExpression.trim().split("\\s+");
        if (elements.length != 3 || !"<".equals(elements[1].trim())) {
            throw new RuntimeException("Expression is invalid: " + strExpression);
        }
        this.key = elements[0].trim();
        this.value = Long.parseLong(elements[2].trim());
    }

    public LessExpression(String key, long value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        System.out.print("interpret " + key + " ==>> ");
        if (!stats.containsKey(key)) {
            System.out.println("key " + key + " does not exist! ignore...");
            return false;
        }
        long statValue = stats.get(key);
        System.out.println(key + " < " + statValue);
        return statValue < value;
    }
}
