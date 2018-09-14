package com.ydy.pattern.pattern_11_command;

/**
 * Author: ydy
 * Created: 2017/9/18 16:38
 * Description:
 */

public class Client {
    public static void main(String[] args) {
        //构造一个接收者对象
        Receiver receiver = new Receiver();

        //根据接收者对象构造一个命令对象
        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);

        //根据具体的对象构造请求者对象
        Invoker invoker = new Invoker(concreteCommand);

        //执行请求方法
        invoker.action();
    }
}
