package com.bigTalkDesignPatterns.AdapterPattern.formal;

/**
 * 内部包装Adaptee对象，把源接口转换成目标接口
 *
 * @author yj
 *
 */
public class Adapter extends Target {

	private Adaptee adaptee = new Adaptee();

	@Override
	public void request() {
		adaptee.specificRequest();
	}
	
}
