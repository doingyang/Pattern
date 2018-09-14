package com.ydy.pattern.pattern_08_state;

/**
 * Author: ydy
 * Created: 2017/9/15 15:05
 * Description:
 */

/**
 * 电视状态接口，定义了电视操作的函数
 */
public interface TvState {
    void nextChannel();
    void preChannel();
    void turnUp();
    void turnDown();
}
