package com.ydy.pattern.pattern_03_builder;

/**
 * Author: ydy
 * Created: 2017/6/13 11:33
 * Description:
 */
//负责构造Computer
public class Director {
    Builder mBuilder = null;

    public Director(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    public void construct(String board, String display){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
