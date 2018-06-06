package com.bigTalkDesignPatterns.StrategyPattern;

/**
 * 算法A的具体实现
 * 
 * @author yj
 * 
 */
public class ConcreateStrategyA extends Strategy {

	@Override
	public void algorithmInterface() {
		System.out.println("algorithm A implements !");
	}

}
