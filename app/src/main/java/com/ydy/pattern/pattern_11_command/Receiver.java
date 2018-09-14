package com.ydy.pattern.pattern_11_command;

/**
 * Author: ydy
 * Created: 2017/9/18 16:28
 * Description:
 */

/**
 * 接收者类
 */
public class Receiver {
    /**
     * 真正执行具体命令逻辑的方法
     */
    public void action(){
        System.out.printf("执行具体操作");
    }
}
