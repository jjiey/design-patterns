package com.design.pattern.Factory;

/**
 * 减法类
 * @author yj
 */
public class OperationSub extends Operation {

	@Override
	public double getResult() {
		return getNumberA() - getNumberB();
	}

}
