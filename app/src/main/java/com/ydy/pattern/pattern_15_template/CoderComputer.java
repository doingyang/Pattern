package com.ydy.pattern.pattern_15_template;

/**
 * Author: ydy
 * Created: 2017/9/20 18:15
 * Description:
 */

/**
 * 程序员的计算机
 */
public class CoderComputer extends AbstractComputer {
    @Override
    protected void login() {
        System.out.println("程序员只需要进行用户和密码验证就可以了");
    }
}
