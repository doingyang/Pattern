package com.ydy.pattern.pattern_10_interpreter;

/**
 * Author: ydy
 * Created: 2017/9/18 14:54
 * Description:
 */

/**
 * 加法运算抽象解释器
 */
public class AdditionExpression extends OperatorExpression {
    public AdditionExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() + exp2.interpret();
    }
}
