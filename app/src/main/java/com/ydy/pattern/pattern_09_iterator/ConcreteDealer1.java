package com.ydy.pattern.pattern_09_iterator;

/**
 * Author: ydy
 * Created: 2017/9/15 17:38
 * Description:
 */

/**
 * 具体的处理者 1
 */
public class ConcreteDealer1 extends Dealer {
    @Override
    public void dealRequest(String condition) {
        if (condition.equals("ConcreteDealer1")){
            System.out.println("ConcreteDealer1 deal");
            return;
        } else {
            successor.dealRequest(condition);
        }
    }
}
