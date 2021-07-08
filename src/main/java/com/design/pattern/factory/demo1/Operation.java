package com.design.pattern.factory.demo1;

import lombok.Getter;
import lombok.Setter;

/**
 * 数据运算基类
 *
 * @author yj
 */
@Setter
@Getter
public abstract class Operation {

	private double numberA = 0;

	private double numberB = 0;

	/**
	 * 获取运算结果
	 *
	 * @return 运算结果
	 */
	public abstract double getResult();
}
