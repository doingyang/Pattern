package com.ydy.pattern.pattern_08_state;

/**
 * Author: ydy
 * Created: 2017/9/15 15:18
 * Description:
 */

/**
 * 电视遥控器
 */
public class TvController2 implements PowerController {
    TvState mTvState;

    public void setTvState(TvState mTvState){
        this.mTvState = mTvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("开机啦");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("关机啦");
    }

    public void nextChannel(){
        mTvState.nextChannel();
    }

    public void preChannel(){
        mTvState.preChannel();
    }

    public void turnUp(){
        mTvState.turnUp();
    }

    public void turnDown(){
        mTvState.turnDown();
    }
}
