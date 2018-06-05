package com.bigTalkDesignPatterns.FactoryPattern;

import lombok.Getter;
import lombok.Setter;

/**
 * 加法类
 * 
 * @author clarck
 * 
 */
public class OperationAdd extends Operation {

	@Override
	public double getResult() {
		double result = getNumberA() + getNumberB();
		return result;
	}

}
