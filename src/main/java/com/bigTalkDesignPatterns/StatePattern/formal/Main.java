package com.bigTalkDesignPatterns.StatePattern.formal;

/**
 * 单元测试类
 *
 * @author yj
 *
 */
public class Main {

	public static void main(String[] args) {
		Context c = new Context(new ConcrateStateA());
		
		c.request();
		c.request();
		c.request();
		c.request();
		c.request();
	}

}
