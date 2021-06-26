package com.design.pattern.Prototype.formal2;

/**
 * 单元测试类
 *
 * @author yj
 *
 */
public class Main {

	public static void main(String[] args) {
		ConcreatePrototype1 p1 = new ConcreatePrototype1("yj");
		ConcreatePrototype1 c1 = (ConcreatePrototype1) p1.Clone();
		String str = String.format("id:%s", c1.getId());
		System.out.println(str);
		
		ConcreatePrototype2 p2 = new ConcreatePrototype2("yj2");
		ConcreatePrototype2 c2 = (ConcreatePrototype2) p2.Clone();
		String str2 = String.format("id:%s", c2.getId());
		System.out.println(str2);
	}

}
