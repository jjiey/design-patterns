package com.design.pattern.builder;

/**
 * 抽象建造者，确定产品有两个部分A和B组成,并声明一个得到产品组合后得到结果的方法getResult.
 * 
 * @author yj
 * 
 */
public abstract class Builder {

	public abstract void buildPartA();

	public abstract void buildPartB();

	public abstract Product getResult();

}
