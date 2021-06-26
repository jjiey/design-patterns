package com.design.pattern.strategy.demo1;

/**
 * 算法B的具体实现
 * 
 * @author yj
 */
public class ConcreteStrategyB extends Strategy {

	@Override
	public void algorithmInterface() {
		System.out.println("algorithm B implements !");
	}
}
