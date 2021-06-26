package com.design.pattern.Proxy.formal;

/**
 * 代理类，保存一个引用使得代理可以访问实体，并提供一个与Subject的接口相同的接口， 这样就可以用代理来代替实体。
 * @author yj
 */
public class Proxy extends Subject {

	private RealSubject realSubject;

	@Override
	public void request() {
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.request();
	}

}
