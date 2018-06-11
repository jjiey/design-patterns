package com.bigTalkDesignPatterns.IteratorPattern;

/**
 * 具体迭代器类
 * 
 * @author yj
 * 
 */
public class ConcrateIterator extends Iterator {
	private ConcrateAggregate aggregate;
	private int current = 0;

	public ConcrateIterator(ConcrateAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		return aggregate.get(0);
	}

	@Override
	public Object next() {
		Object ret = null;
		current++;
		if (current < aggregate.getCount()) {
			ret = aggregate.get(current);
		}

		return ret;
	}

	@Override
	public boolean isDone() {
		return current >= aggregate.getCount() ? true : false;
	}

	@Override
	public Object currentItem() {
		return aggregate.get(current);
	}

}
