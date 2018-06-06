package com.bigTalkDesignPatterns.DecoratorPattern;

/**
 * 具体的装饰对象A，起到给Component添加职责的作用
 * 
 * @author yj
 * 
 */
public class ConcreateDecoratorA extends Decorator {
	private String addedState;

	@Override
	public void Operation() {
		super.Operation();
		addedState = "New State";
		System.out.println("具体装饰对象A的操作" + addedState);
	}

}
