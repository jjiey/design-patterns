package com.bigTalkDesignPatterns.BuilderPattern;

/**
 * 指挥者
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
