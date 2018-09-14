package com.ydy.pattern.pattern_11_command.simple;

/**
 * Author: ydy
 * Created: 2017/9/18 16:30
 * Description:
 */

/**
 * 命令者抽象：定义执行方法
 */
public interface Command {
    /**
     * 命令执行方法
     */
    void execute();
}
