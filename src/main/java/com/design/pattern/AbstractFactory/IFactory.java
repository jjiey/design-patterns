package com.design.pattern.AbstractFactory;

import com.design.pattern.factory.demo1.Operation;

/**
 * 抽象工厂类
 * @author yj
 */
public interface IFactory {

    Operation createOperation();

}
