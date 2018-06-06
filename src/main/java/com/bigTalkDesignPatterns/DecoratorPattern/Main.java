package com.bigTalkDesignPatterns.DecoratorPattern;

/**
 * 单元测试类
 *
 * @author yj
 *
 */
public class Main {
	public static void main(String[] args) {
		ConcreateComponent component = new ConcreateComponent();
		ConcreateDecoratorA decoratorA = new ConcreateDecoratorA();
		ConcreateDecoratorB decoratorB = new ConcreateDecoratorB();

		decoratorA.setComponent(component);
		decoratorB.setComponent(decoratorA);
		decoratorB.Operation();
	}
}
