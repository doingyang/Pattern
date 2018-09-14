package com.ydy.pattern.pattern_10_interpreter;

/**
 * Author: ydy
 * Created: 2017/9/18 14:42
 * Description:
 */

/**
 * 抽象的算术运算解释器：所有解释器共性的提取
 */
public abstract class ArithmeticExpression {
    /**
     * 抽象的解析方法
     * 具体的解析逻辑由具体的子类实现
     * @return 解析得到具体的值
     */
    public abstract int interpret();
}
