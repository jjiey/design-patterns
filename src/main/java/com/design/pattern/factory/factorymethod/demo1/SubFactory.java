package com.design.pattern.factory.factorymethod.demo1;

import com.design.pattern.factory.simplefactory.demo1.Operation;
import com.design.pattern.factory.simplefactory.demo1.OperationSub;

/**
 * 减法工厂
 *
 * @author yj
 */
public class SubFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}
}
