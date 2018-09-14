package com.ydy.pattern.pattern_11_command;

/**
 * Author: ydy
 * Created: 2017/9/18 16:34
 * Description:
 */

/**
 * 请求者类
 */
public class Invoker {
    //持有一个对相应命令对象的引用
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        //调用具体命令对象的相关方法，执行具体命令
        command.execute();
    }
}
