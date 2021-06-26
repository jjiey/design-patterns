package com.design.pattern.AbstractFactory;

import com.design.pattern.Factory.Operation;
import com.design.pattern.Factory.OperationDiv;

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
