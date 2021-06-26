package com.design.pattern.Interpreter;

/**
 * 非终结符表达式
 *
 * @author yj
 *
 */
public class NonterminalExpression extends AbstractExpression {

	@Override
	public void Interpreter(Context context) {
		System.out.println("非终端解释器");
	}

}
