package com.design.pattern.AbstractFactory;

import com.design.pattern.factory.demo1.Operation;
import com.design.pattern.factory.demo1.OperationDiv;

/**
 * 除法工厂
 * @author yj
 */
public class DivFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}

}
