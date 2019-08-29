package com.bigTalkDesignPatterns.FactoryPattern;

/**
 * 乘法类
 * @author yj
 */
public class OperationMul extends Operation {

	@Override
	public double getResult() {
		return getNumberA() * getNumberB();
	}

}
