package com.bigTalkDesignPatterns.PrototypePattern.formal1;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 原型类
 * Clone()由子类完成
 * 
 * @author yj
 * 
 */
@Getter
@AllArgsConstructor
public abstract class Prototype {

	private String id;

	public abstract Prototype Clone();

}
