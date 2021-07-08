package com.design.pattern.AbstractFactory;

import com.design.pattern.factory.demo1.Operation;
import com.design.pattern.factory.demo1.OperationMul;

/**
 * 乘法工厂
 * @author yj
 */
public class MulFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}

}
