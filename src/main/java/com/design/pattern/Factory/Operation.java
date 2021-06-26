package com.design.pattern.Factory;

import lombok.Getter;
import lombok.Setter;

/**
 * 数据运算基类
 * @author yj
 */
@Setter
@Getter
public class Operation {

	private double numberA = 0;
	private double numberB = 0;

	/**
	 * 获取运算结果
	 * @return 运算结果
	 */
	public double getResult() {
		double result = 0;
		return result;
	}

}
