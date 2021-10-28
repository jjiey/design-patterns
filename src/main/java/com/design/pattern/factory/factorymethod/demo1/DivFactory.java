package com.design.pattern.factory.factorymethod.demo1;

import com.design.pattern.factory.simplefactory.demo1.Operation;
import com.design.pattern.factory.simplefactory.demo1.OperationDiv;

/**
 * 除法工厂
 *
 * @author yj
 */
public class DivFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}
}
