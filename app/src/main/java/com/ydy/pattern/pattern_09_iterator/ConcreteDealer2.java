package com.ydy.pattern.pattern_09_iterator;

/**
 * Author: ydy
 * Created: 2017/9/15 17:38
 * Description:
 */

/**
 * 具体的处理者 2
 */
public class ConcreteDealer2 extends Dealer {
    @Override
    public void dealRequest(String condition) {
        if (condition.equals("ConcreteDealer2")){
            System.out.println("ConcreteDealer2 deal");
            return;
        } else {
            successor.dealRequest(condition);
        }
    }
}
