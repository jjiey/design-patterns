package com.design.pattern.observer.demo1;

/**
 * 单元测试类
 *
 * @author yj
 */
public class Main {

	public static void main(String[] args) {
		ConcreteSubject concreteSubject = new ConcreteSubject();
		concreteSubject.attach(new ConcreteObserver(concreteSubject, "X"));
		concreteSubject.attach(new ConcreteObserver(concreteSubject, "Y"));
		concreteSubject.attach(new ConcreteObserver(concreteSubject, "Z"));
		
		concreteSubject.setSubjectState("ABC");
		concreteSubject.notification();
	}

}
