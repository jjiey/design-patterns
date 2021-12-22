package com.design.pattern.builder;

/**
 * 指挥者
 * 控制构建过程，隔离用户与建造过程的关联
 * 
 * @author yj
 * 
 */
public class Director {

	public void Construct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}

}
