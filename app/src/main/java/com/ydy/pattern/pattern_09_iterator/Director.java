package com.ydy.pattern.pattern_09_iterator;

/**
 * Author: ydy
 * Created: 2017/9/15 18:20
 * Description:
 */

public class Director extends Leader {
    @Override
    public int limit() {
        return 5000;
    }

    @Override
    public void handle(int money) {
        System.out.printf("主管批复报销" + money + "元");
    }
}
