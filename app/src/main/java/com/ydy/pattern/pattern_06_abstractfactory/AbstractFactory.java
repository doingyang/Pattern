package com.ydy.pattern.pattern_06_abstractfactory;

/**
 * Author: ydy
 * Created: 2017/9/11 15:12
 * Description:
 */

/**
 * 抽象工厂类
 */
public abstract class AbstractFactory {
    /**
     * 创建产品 A 的方法
     * @return 产品 A 对象
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建产品 B 的方法
     * @return 产品 B 对象
     */
    public abstract AbstractProductB createProductB();
}
