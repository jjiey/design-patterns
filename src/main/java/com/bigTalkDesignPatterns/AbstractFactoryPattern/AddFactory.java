package com.bigTalkDesignPatterns.AbstractFactoryPattern;

import com.bigTalkDesignPatterns.FactoryPattern.Operation;
import com.bigTalkDesignPatterns.FactoryPattern.OperationAdd;

/**
 * 加法工厂
 * @author yj
 */
public class AddFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}

}
