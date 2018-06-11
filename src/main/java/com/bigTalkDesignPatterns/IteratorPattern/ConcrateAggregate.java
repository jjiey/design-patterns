package com.bigTalkDesignPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚集类
 *
 * @author yj
 *
 */
public class ConcrateAggregate extends Aggregate {
	private List<Object> items = new ArrayList<Object>();

	@Override
	public Iterator createIterator() {
		return new ConcrateIterator(this);
	}

	public int getCount() {
		return items.size();
	}

	public Object get(int index) {
		return items.get(index);
	}

	public void set(int index, Object value) {
		items.add(value);
	}
}
