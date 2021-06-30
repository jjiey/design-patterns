package com.design.pattern.state.demo1;

/**
 * 单元测试类
 *
 * @author yj
 */
public class Main {

	public static void main(String[] args) {
		Context c = new Context(new ConcreteStateA());
		
		c.request();
		c.request();
		c.request();
		c.request();
		c.request();
	}
}
