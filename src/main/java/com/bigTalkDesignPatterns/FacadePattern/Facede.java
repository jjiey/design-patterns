package com.bigTalkDesignPatterns.FacadePattern;

/**
 * 外观类 知道哪些子系统负责处理请求，将客户的请求代理给适当的子系统对象
 * 
 * @author yj
 * 
 */
public class Facede {

	private SubSystemOne one;
	private SubSystemTwo two;
	private SubSystemThree three;
	private SubSystemFour four;

	public Facede() {
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
	}

	public void methodA() {
		System.out.println("方法组A ---------");
		one.methodOne();
		two.methodTwo();
		four.methodFour();
	}

	public void methodB() {
		System.out.println("方法组B ---------");
		two.methodTwo();
		three.methodThree();
	}

}
