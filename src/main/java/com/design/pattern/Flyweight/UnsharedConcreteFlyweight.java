package com.design.pattern.Flyweight;

/**
 * 不需要共享的Flyweight子类，解决不需要共享对象的问题
 *
 * @author yj
 *
 */
public class UnsharedConcreteFlyweight extends Flyweight {
	
	@Override
	public void operation(int exrinsicstate) {
		System.out.println(String.format("不共享的具体Flyweight:%d", exrinsicstate));
	}

}
