package com.design.pattern.Bridge;

/**
 * 单元测试类
 *
 * @author yj
 *
 */
public class Main {
	public static void main(String[] args) {
		Abstraction ab = new RefinedAbstraction();
		
		ab.setImplementor(new ConcrateImplementorA());
		ab.opreation();
		
		ab.setImplementor(new ConcrateImplementorB());
		ab.opreation();
	}
}
