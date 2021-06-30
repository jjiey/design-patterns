package com.design.pattern.Iterator;

/**
 * 单元测试类
 *
 * @author yj
 *
 */
public class Main {
	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		a.set(0, "daniao");
		a.set(1, "xiaocai");
		a.set(2, "xingli");
		a.set(3, "laowai");
		a.set(4, "gongjiaoneibuyuangong");
		a.set(5, "xiaotou");
		Iterator i = new ConcreteIterator(a);
		Object item = i.first();
		System.out.println(item);
		while (!i.isDone()) {
			System.out.println("qingmaichepiao!" + i.currentItem());
			i.next();
		}
	}
}
