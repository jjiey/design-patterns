package com.design.pattern.Builder;

/**
 * 单元测试类
 *
 * @author yj
 *
 */
public class Main {

	public static void main(String[] args) {
		Director director = new Director();
		Builder builder1 = new ConcrateBuilder1();
		Builder builder2 = new ConcrateBuilder2();

		director.Construct(builder1);
		Product product1 = builder1.getResult();
		product1.show();

		director.Construct(builder2);
		Product product2 = builder2.getResult();
		product2.show();
	}

}
