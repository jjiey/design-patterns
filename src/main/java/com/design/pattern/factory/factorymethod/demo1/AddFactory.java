package com.design.pattern.factory.factorymethod.demo1;

import com.design.pattern.factory.simplefactory.demo1.Operation;
import com.design.pattern.factory.simplefactory.demo1.OperationAdd;

/**
 * 加法工厂
 *
 * @author yj
 */
public class AddFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}
}
