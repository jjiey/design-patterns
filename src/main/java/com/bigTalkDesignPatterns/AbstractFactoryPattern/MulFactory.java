package com.bigTalkDesignPatterns.AbstractFactoryPattern;

import com.bigTalkDesignPatterns.FactoryPattern.Operation;
import com.bigTalkDesignPatterns.FactoryPattern.OperationMul;

/**
 * 乘法工厂
 * 
 * @author yj
 * 
 */
public class MulFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}
}
