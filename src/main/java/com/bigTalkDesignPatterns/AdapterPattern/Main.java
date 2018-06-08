package com.bigTalkDesignPatterns.AdapterPattern;

/**
 * 单元测试类
 *
 * @author yj
 *
 */
public class Main {

	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}

}
