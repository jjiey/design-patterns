package com.design.pattern.strategy.demo1;

/**
 * 算法A的具体实现
 * 
 * @author yj
 */
public class ConcreteStrategyA extends Strategy {

	@Override
	public void algorithmInterface() {
		System.out.println("algorithm A implements !");
	}
}
