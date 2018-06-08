package com.bigTalkDesignPatterns.ObseverPattern;

/**
 * 单元测试类
 *
 * @author yj
 *
 */
public class Main {
	public static void main(String[] args) {
		ConcrateSubject concrateSubject = new ConcrateSubject();
		concrateSubject.attach(new ConcrateObserver(concrateSubject, "X"));
		concrateSubject.attach(new ConcrateObserver(concrateSubject, "Y"));
		concrateSubject.attach(new ConcrateObserver(concrateSubject, "Z"));
		
		concrateSubject.setSubjectState("ABC");
		concrateSubject.notification();
	}
}
