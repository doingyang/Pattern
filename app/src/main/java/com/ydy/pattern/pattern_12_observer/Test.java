package com.ydy.pattern.pattern_12_observer;

/**
 * Author: ydy
 * Created: 2017/9/19 16:18
 * Description:
 */

public class Test {
    public static void main(String[] args) {
        // 被观察者角色
        DevTechFrontier devTechFrontier = new DevTechFrontier();
        // 观察者
        Coder mrydy = new Coder("Mr.YDY");
        Coder coder1 = new Coder("coder-1");
        Coder coder2 = new Coder("coder-2");
        Coder coder3 = new Coder("coder-3");
        // 将观察者注册到可观察对象的观察者列表中
        devTechFrontier.addObserver(mrydy);
        devTechFrontier.addObserver(coder1);
        devTechFrontier.addObserver(coder2);
        devTechFrontier.addObserver(coder3);
        // 发布消息
        devTechFrontier.postNewPublication("新一期的开发技术前线周报发布啦！");
    }
}
