package com.design.pattern.Interpreter;

/**
 * 终结符表达式
 *
 * @author yj
 *
 */
public class TerminalExpression extends AbstractExpression {

	@Override
	public void Interpreter(Context context) {
		System.out.println("终端解释器");
	}

}
