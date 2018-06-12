package com.bigTalkDesignPatterns.BridgePattern;

/**
 * ConcrateImplementorA
 * 
 * @author yj
 *
 */
public class ConcrateImplementorA extends Implementor {

	@Override
	public void operation() {
		System.out.println("具体实现A的方法执行");
	}

}
