package com.bigTalkDesignPatterns.DecoratorPattern.formal;

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

		decoratorA.setComponent(component); // decoratorA包装component
		decoratorB.setComponent(decoratorA); // decoratorB包装decoratorA
		decoratorB.Operation(); // 最终执行decoratorB的Operation()
	}

}
