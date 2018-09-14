package com.ydy.pattern.pattern_09_iterator;

/**
 * Author: ydy
 * Created: 2017/9/15 18:24
 * Description:
 */

/**
 * 客户类
 */
public class XiaoMing {
    public static void main(String[] args) {
        //构造各个领导对象
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();
        //设置上一级领导处理者对象
        groupLeader.nextHandler = director;
        director.nextHandler = manager;
        manager.nextHandler = boss;
        //发起报账申请
        groupLeader.handlerRequest(50000);
    }
}
