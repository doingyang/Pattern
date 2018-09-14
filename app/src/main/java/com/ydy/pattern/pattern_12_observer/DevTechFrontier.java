package com.ydy.pattern.pattern_12_observer;

import java.util.Observable;

/**
 * Author: ydy
 * Created: 2017/9/19 16:09
 * Description:
 */

/**
 * 被观察者：DevTechFrontier即开发技术前线，这个网站是被观察者角色
 * 当它有更新时所有的观察者（这里是程序员）都会接到相应的通知
 */
public class DevTechFrontier extends Observable {

    public void postNewPublication(String content){
        // 标识状态或者内容发生改变
        setChanged();
        // 通知所有观察者
        notifyObservers(content);
    }
}
