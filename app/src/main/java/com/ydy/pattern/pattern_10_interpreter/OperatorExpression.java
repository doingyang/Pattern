package com.ydy.pattern.pattern_10_interpreter;

/**
 * Author: ydy
 * Created: 2017/9/18 14:50
 * Description:
 */

/**
 * 运算符号抽象解释器：所有运算符号解释器共性的提取
 */
public abstract class OperatorExpression extends ArithmeticExpression {
    //声明两个成员变量存储运算符号两边的数字解释器
    protected ArithmeticExpression exp1, exp2;

    public OperatorExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
