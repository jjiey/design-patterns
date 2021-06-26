package com.design.pattern.Bridge;

import lombok.Setter;

/**
 * Abstraction类
 *
 * @author yj
 *
 */
@Setter
public class Abstraction {

	protected Implementor implementor;
	
	public void opreation() {
		this.implementor.operation();
	}
	
}
