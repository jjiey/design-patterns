package com.bigTalkDesignPatterns.FactoryPattern;

/**
 * 加法类
 * @author yj
 */
public class OperationAdd extends Operation {

	@Override
	public double getResult() {
		return getNumberA() + getNumberB();
	}

}
