package com.ydy.pattern.pattern_06_abstractfactory;

/**
 * Author: ydy
 * Created: 2017/9/11 15:15
 * Description:
 */

/**
 * 具体工厂类 2
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
