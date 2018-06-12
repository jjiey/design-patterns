package com.bigTalkDesignPatterns.BridgePattern;

/**
 * RefinedAbstraction类（被提炼的抽象）
 *
 * @author yj
 *
 */
public class RefinedAbstraction extends Abstraction {

	@Override
	public void opreation() {
		implementor.operation();
	}
	
}
