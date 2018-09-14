package com.ydy.pattern.pattern_10_interpreter;

/**
 * Author: ydy
 * Created: 2017/9/18 15:22
 * Description:
 */

/**
 * 客户类
 */
public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("1 + 2 + 3 + 4 - 3 - 4");
        System.out.printf(String.valueOf(calculator.calculate()));
    }
}
