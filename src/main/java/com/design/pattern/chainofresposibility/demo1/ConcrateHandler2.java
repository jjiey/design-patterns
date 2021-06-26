package com.design.pattern.chainofresposibility.demo1;

/**
 * 处理者2
 *
 * @author yj
 */
public class ConcrateHandler2 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request >= 10 && request < 20) {
			System.out.println(String.format("%s处理请求%d", this.getClass().getName(), request));
		} else if (successor != null) {
			successor.handleRequest(request);
		}
	}
}
