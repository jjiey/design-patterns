package com.design.pattern.factory.simplefactory.demo1;

/**
 * 加法类
 *
 * @author yj
 */
public class OperationAdd extends Operation {

	@Override
	public double getResult() {
		return getNumberA() + getNumberB();
	}
}
