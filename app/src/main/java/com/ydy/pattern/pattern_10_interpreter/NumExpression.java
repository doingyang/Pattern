package com.ydy.pattern.pattern_10_interpreter;

/**
 * Author: ydy
 * Created: 2017/9/18 14:48
 * Description:
 */

/**
 * 数字解释器：仅仅为了解释数字
 */
public class NumExpression extends ArithmeticExpression {
    private int num;

    public NumExpression(int num){
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
