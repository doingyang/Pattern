package com.ydy.pattern.pattern_03_builder;

/**
 * Author: ydy
 * Created: 2017/6/12 18:30
 * Description:
 */
//计算机抽象类
public abstract class Computer {

    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected Computer(){}

    //设置主板
    public void setBoard(String board){
        mBoard = board;
    }
    //设置显示器
    public void setDisplay(String display) {
        mDisplay = display;
    }
    //设置操作系统
    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
