package com.ydy.pattern.pattern_09_iterator;

/**
 * Author: ydy
 * Created: 2017/9/15 17:42
 * Description:
 */

/**
 * 客户类
 */
public class Client {
    public static void main(String[] args) {
        //构造一个ConcreteDealer1对象
        ConcreteDealer1 dealer1 = new ConcreteDealer1();
        //构造一个ConcreteDealer2对象
        ConcreteDealer2 dealer2 = new ConcreteDealer2();
        //设置dealer1的下一个节点
        dealer1.successor = dealer2;
        //设置dealer2的下一个节点
        dealer2.successor = dealer1;
        //处理请求
        dealer1.dealRequest("ConcreteDealer2");
    }
}
