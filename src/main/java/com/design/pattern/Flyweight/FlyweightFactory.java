package com.design.pattern.Flyweight;

import java.util.Hashtable;

/**
 * 享元工厂
 *
 * @author yj
 *
 */
public class FlyweightFactory {
	private Hashtable flyweight = new Hashtable();

	/*
	 * 也可以初始化时什么都不做，需要时再去判断对象是否为null来决定是否实例化
	 */
	public FlyweightFactory() {
		flyweight.put("X", new ConcreteFlyweight());
		flyweight.put("Y", new ConcreteFlyweight());
		flyweight.put("Z", new ConcreteFlyweight());
	}
	
	public Flyweight getFlyweight(String key) {
		return (Flyweight) flyweight.get(key);
	}
	
}
