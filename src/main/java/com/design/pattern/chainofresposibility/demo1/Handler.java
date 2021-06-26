package com.design.pattern.chainofresposibility.demo1;

import lombok.Setter;

/**
 * 处理请示的接口
 *
 * @author yj
 *
 */
@Setter
public abstract class Handler {

	protected Handler successor;
	
	public abstract void handleRequest(int request);
}
