package com.bigTalkDesignPatterns.FactoryPattern;

/**
 * 减法类
 * 
 * @author yj
 * 
 */
public class OperationSub extends Operation {

	@Override
	public double getResult() {
		double result = getNumberA() - getNumberB();
		return result;
	}

}
