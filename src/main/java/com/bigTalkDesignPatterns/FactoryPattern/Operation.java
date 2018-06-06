package com.bigTalkDesignPatterns.FactoryPattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 数据运算基类
 *
 * @author yj
 *
 */
@Setter
@Getter
@ToString
public class Operation {
	private double numberA = 0;
	private double numberB = 0;

	/**
	 * 获取运算结果
	 * @return
	 */
	public double getResult() {
		double result = 0;
		return result;
	}

}
