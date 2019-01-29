package com.bigTalkDesignPatterns.AbstractFactoryPattern;

import com.bigTalkDesignPatterns.FactoryPattern.Operation;
import com.bigTalkDesignPatterns.FactoryPattern.OperationSub;

/**
 * 减法工厂
 * 
 * @author yj
 * 
 */
public class SubFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}

}
