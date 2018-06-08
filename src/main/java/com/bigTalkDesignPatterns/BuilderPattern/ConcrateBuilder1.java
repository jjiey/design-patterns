package com.bigTalkDesignPatterns.BuilderPattern;

/**
 * 具体建造者1
 * 
 * @author yj
 * 
 */
public class ConcrateBuilder1 extends Builder {
	private Product product = new Product();

	@Override
	public void buildPartA() {
		product.add("部件A");
	}

	@Override
	public void buildPartB() {
		product.add("部件B");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
