package com.design.pattern.Bridge;

/**
 * ConcreteImplementorA
 * 
 * @author yj
 *
 */
public class ConcreteImplementorA extends Implementor {

	@Override
	public void operation() {
		System.out.println("具体实现A的方法执行");
	}

}
