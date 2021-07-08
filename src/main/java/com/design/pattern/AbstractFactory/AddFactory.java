package com.design.pattern.AbstractFactory;

import com.design.pattern.factory.demo1.Operation;
import com.design.pattern.factory.demo1.OperationAdd;

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
