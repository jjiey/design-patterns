package com.bigTalkDesignPatterns.FactoryPattern;

import com.bigTalkDesignPatterns.PatternsUtil;

/**
 * 除法类
 * 
 * @author yj
 * 
 */
public class OperationDiv extends Operation {

	@Override
	public double getResult() {
		if (getNumberB() == 0) {
			PatternsUtil.throwException("the div number can't be zero.");
		}
		double result = getNumberA() / getNumberB();
		return result;
	}

}
