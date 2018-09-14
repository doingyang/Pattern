package com.ydy.pattern.pattern_03_builder;

/**
 * Author: ydy
 * Created: 2017/6/12 18:34
 * Description:
 */
//具体的Computer类，Macbook
public class Macbook extends Computer {

    protected Macbook(){}

    @Override
    public void setOS() {
        mOS = "Mac OS X 10.10";
    }

}
