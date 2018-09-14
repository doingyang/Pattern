package com.ydy.pattern.pattern_08_state;

/**
 * Author: ydy
 * Created: 2017/9/15 15:24
 * Description:
 */

/**
 * 客户端调用
 */
public class Client {
    public static void main(String[] args){
        TvController2 tvController2 = new TvController2();
        //设置状态：开机
        tvController2.powerOn();
        //下一频道
        tvController2.nextChannel();
        //调高音量
        tvController2.turnUp();
        //设置状态：关机
        tvController2.powerOff();
        //调高音量，此时不会生效！！！
        tvController2.turnUp();
    }
}
