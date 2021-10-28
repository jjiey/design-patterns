package com.design.pattern.factory.simplefactory.demo1;

import com.design.pattern.PatternsUtil;

/**
 * 除法类
 *
 * @author yj
 */
public class OperationDiv extends Operation {

	@Override
	public double getResult() {
		if (getNumberB() == 0) {
			PatternsUtil.throwException("the div number can't be zero.");
		}
		return getNumberA() / getNumberB();
	}
}
