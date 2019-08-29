package com.bigTalkDesignPatterns.SingletonPattern;

/**
 * 单元测试类
 * @author yj
 */
public class Main {
	public static void main(String[] args) {
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();

		if (s1 == s2) {
			System.out.println("两个对象是相同的实例");
		}
	}
	
}
