package com.bigTalkDesignPatterns.InterpreterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 单元测试类
 *
 * @author yj
 *
 */
public class Main {
	public static void main(String[] args) {
		Context context = new Context();
		
		List<AbstractExpression> list = new ArrayList<>();
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());
		
		for (AbstractExpression expression : list) {
			expression.Interpreter(context);
		}
	}
}
