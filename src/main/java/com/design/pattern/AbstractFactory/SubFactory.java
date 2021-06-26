package com.design.pattern.AbstractFactory;

import com.design.pattern.Factory.Operation;
import com.design.pattern.Factory.OperationSub;

/**
 * 减法工厂
 * @author yj
 */
public class SubFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}

}
