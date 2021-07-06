package com.design.pattern.interpreter.demo1;

import lombok.Getter;
import lombok.Setter;

/**
 * 包含解释器之外的一些全局信息
 *
 * @author yj
 */
@Getter
@Setter
public class Context {

	private String input;
	private String output;
}
