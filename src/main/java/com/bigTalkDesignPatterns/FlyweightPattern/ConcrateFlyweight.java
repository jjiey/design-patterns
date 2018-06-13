package com.bigTalkDesignPatterns.FlyweightPattern;

/**
 * 具体享元类
 *
 * @author yj
 *
 */
public class ConcrateFlyweight extends Flyweight {
	
	@Override
	public void operation(int exrinsicstate) {
		System.out.println(String.format("具体Flayweight:%s" , exrinsicstate));
	}

}
