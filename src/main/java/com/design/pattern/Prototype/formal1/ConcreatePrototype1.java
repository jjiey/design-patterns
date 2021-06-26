package com.design.pattern.Prototype.formal1;

/**
 * 要想真正拥有克隆的能力，就需要实现Cloneable接口，重写clone方法。通过克隆方法得到的对象得到的是一个本地的副本
 * 
 * @author yj
 * 
 */
public class ConcreatePrototype1 extends Prototype implements Cloneable {

	public ConcreatePrototype1(String id) {
		super(id);
	}

	@Override
	public Prototype Clone() {
		Prototype protoType = null;
		try {
			protoType = (Prototype) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return protoType;
	}
	
}
