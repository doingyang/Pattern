package com.ydy.pattern.pattern_08_state;

/**
 * Author: ydy
 * Created: 2017/9/15 14:31
 * Description:
 */

/**
 * 以电视遥控器为例
 * 首先将电视的状态简单分为 开机状态 和 关机状态
 * 开机状态下：可以通过遥控器进行频道切换、调整音量等操作，但此时重复按开机键是无效的；
 * 关机状态下：频道切换、调整音量、关机都是无效的操作，只有按开机按钮时会生效
 * 即电视机的内部状态决定了遥控器的行为
 */
public class TvController {
    //开机状态
    private static final int POWER_ON = 1;
    //关机状态
    private static final int POWER_OFF = 2;
    private int mState = POWER_OFF;

    public void powerOn(){
        mState = POWER_ON;
        if (mState == POWER_OFF){
            System.out.println("开机啦");
        }
    }

    public void powerOff(){
        mState = POWER_OFF;
        if (mState == POWER_ON){
            System.out.println("关机啦");
        }
    }

    public void nextChannel(){
        if (mState == POWER_ON){
            System.out.println("下一频道");
        } else {
            System.out.println("两个红灯提示没有开机");
        }
    }

    public void preChannel(){
        if (mState == POWER_ON){
            System.out.println("上一频道");
        } else {
            System.out.println("两个红灯提示没有开机");
        }
    }

    public void turnUp(){
        if (mState == POWER_ON){
            System.out.println("调高音量");
        } else {
            System.out.println("两个红灯提示没有开机");
        }
    }

    public void turnDown(){
        if (mState == POWER_ON){
            System.out.println("调低音量");
        } else {
            System.out.println("两个红灯提示没有开机");
        }
    }

}
