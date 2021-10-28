package com.design.pattern.factory.factorymethod.demo1;

import com.design.pattern.factory.simplefactory.demo1.Operation;

/**
 * 抽象工厂类
 *
 * @author yj
 */
public interface IFactory {

    Operation createOperation();
}
