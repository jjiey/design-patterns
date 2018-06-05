package com.bigTalkDesignPatterns.FactoryPattern;

import com.bigTalkDesignPatterns.PatternsUtil;

/**
 * 除法类
 * 
 * @author clarck
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
