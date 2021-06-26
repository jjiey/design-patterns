package com.design.pattern.Bridge;

/**
 * ConcrateImplementorB
 *
 * @author yj
 *
 */
public class ConcrateImplementorB extends Implementor {

	@Override
	public void operation() {
		System.out.println("具体实现B的方法执行");
	}

}
