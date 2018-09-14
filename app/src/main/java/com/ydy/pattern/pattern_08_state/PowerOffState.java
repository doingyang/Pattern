package com.ydy.pattern.pattern_08_state;

/**
 * Author: ydy
 * Created: 2017/9/15 15:10
 * Description:
 */

/**
 * 关机状态：此时只有开机功能是有效的
 */
public class PowerOffState implements TvState{
    @Override
    public void nextChannel() {

    }

    @Override
    public void preChannel() {

    }

    @Override
    public void turnUp() {

    }

    @Override
    public void turnDown() {

    }
}
