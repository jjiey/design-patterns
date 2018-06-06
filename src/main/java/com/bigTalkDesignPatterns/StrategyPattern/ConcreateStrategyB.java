package com.bigTalkDesignPatterns.StrategyPattern;

/**
 * 算法B的具体实现
 * 
 * @author yj
 * 
 */
public class ConcreateStrategyB extends Strategy {

	@Override
	public void algorithmInterface() {
		System.out.println("algorithm B implements !");
	}

}
