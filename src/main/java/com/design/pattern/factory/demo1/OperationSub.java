package com.design.pattern.factory.demo1;

/**
 * 减法类
 *
 * @author yj
 */
public class OperationSub extends Operation {

	@Override
	public double getResult() {
		return getNumberA() - getNumberB();
	}
}
