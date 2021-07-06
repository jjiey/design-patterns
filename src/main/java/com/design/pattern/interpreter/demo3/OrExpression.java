package com.design.pattern.interpreter.demo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author yangsanity
 */
public class OrExpression implements Expression {

    private final List<Expression> expressions = new ArrayList<>();

    public OrExpression(String strOrExpression) {
        String[] andExpressions = strOrExpression.split("\\|\\|");
        for (String andExpr : andExpressions) {
            expressions.add(new AndExpression(andExpr));
        }
    }

    public OrExpression(List<Expression> expressions) {
        this.expressions.addAll(expressions);
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        for (Expression expr : expressions) {
            // 任意一条规则满足就报警
            if (expr.interpret(stats)) {
                return true;
            }
        }
        return false;
    }
}
