package com.bigTalkDesignPatterns.AbstractFactoryPattern;

import com.bigTalkDesignPatterns.FactoryPattern.Operation;
import com.bigTalkDesignPatterns.FactoryPattern.OperationDiv;

/**
 * 除法工厂
 * 
 * @author yj
 * 
 */
public class DivFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}

}
