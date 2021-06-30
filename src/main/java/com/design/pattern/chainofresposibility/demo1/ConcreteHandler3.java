package com.design.pattern.chainofresposibility.demo1;

/**
 * 处理者3
 *
 * @author yj
 */
public class ConcreteHandler3 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request >= 20 && request < 30) {
			System.out.println(String.format("%s处理请求%d", this.getClass().getName(), request));
		} else if (successor != null) {
			successor.handleRequest(request);
		}
	}
}
