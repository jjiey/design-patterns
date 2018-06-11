package com.bigTalkDesignPatterns.SingletonPattern;

/**
 * 单例类
 *
 * @author yj
 *
 */
public class Singleton {
	private static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}
}
