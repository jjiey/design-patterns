package com.bigTalkDesignPatterns.ProxyPattern.formal;

/**
 * 定义Proxy所代表的真实实体
 * 
 * @author yj
 * 
 */
public class RealSubject extends Subject {

	@Override
	public void request() {
		System.out.println("真实请求");
	}

}
