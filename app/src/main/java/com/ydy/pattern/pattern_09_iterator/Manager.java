package com.ydy.pattern.pattern_09_iterator;

/**
 * Author: ydy
 * Created: 2017/9/15 18:20
 * Description:
 */

public class Manager extends Leader {
    @Override
    public int limit() {
        return 10000;
    }

    @Override
    public void handle(int money) {
        System.out.printf("经理批复报销" + money + "元");
    }
}
