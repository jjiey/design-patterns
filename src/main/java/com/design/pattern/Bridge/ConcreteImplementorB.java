package com.design.pattern.Bridge;

/**
 * ConcreteImplementorB
 *
 * @author yj
 *
 */
public class ConcreteImplementorB extends Implementor {

	@Override
	public void operation() {
		System.out.println("具体实现B的方法执行");
	}

}
