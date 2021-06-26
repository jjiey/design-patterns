package com.design.pattern.Decorator.formal;

/**
 * 具体的装饰对象B
 * @author yj
 */
public class ConcreateDecoratorB extends Decorator {

	@Override
	public void Operation() {
		super.Operation();
		addedBehaivor();
		System.out.println("具体装饰对象B");
	}

	private void addedBehaivor() { //用来区别ConcreateDecoratorA
		
	}
}
