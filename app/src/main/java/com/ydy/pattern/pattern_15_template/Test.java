package com.ydy.pattern.pattern_15_template;

/**
 * Author: ydy
 * Created: 2017/9/20 18:19
 * Description:
 */

public class Test {
    public static void main(String[] args) {
        AbstractComputer computer = new CoderComputer();
        computer.startUp();
        computer = new MilitaryComputer();
        computer.startUp();
    }
}
