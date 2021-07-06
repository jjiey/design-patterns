package com.design.pattern.interpreter.demo3;

import java.util.Map;

/**
 * @author yangsanity
 */
public class AlertRuleInterpreter {

    private final Expression expression;

    public AlertRuleInterpreter(String ruleExpression) {
        this.expression = new OrExpression(ruleExpression);
    }

    public boolean interpret(Map<String, Long> stats) {
        return expression.interpret(stats);
    }
}
