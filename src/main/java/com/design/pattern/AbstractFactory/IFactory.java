package com.design.pattern.AbstractFactory;

import com.design.pattern.Factory.Operation;

/**
 * 抽象工厂类
 * @author yj
 */
public interface IFactory {

    Operation createOperation();

}
