package com.design.pattern.Prototype.formal2;

/**
 * 要想真正拥有克隆的能力，就需要实现Cloneable接口，重写clone方法。通过克隆方法得到的对象得到的是一个本地的副本
 * 
 * @author yj
 * 
 */
public class ConcreatePrototype1 extends Prototype {

	public ConcreatePrototype1(String id) {
		super(id);
	}
	
}
