package com.ydy.pattern.pattern_12_observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Author: ydy
 * Created: 2017/9/19 15:32
 * Description:
 */

/**
 * 观察者：程序员
 */
public class Coder implements Observer {
    private String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.printf("Hi, " + name + ", DevTechFrontier更新啦，内容：" + arg + "\n");
    }
}
