package com.ydy.pattern.pattern_11_command.simple;

/**
 * Author: ydy
 * Created: 2017/9/18 17:13
 * Description:
 */

/**
 * 具体命令者：变换形状的命令类
 */
public class TransformCommand implements Command {
    //持有一个接收者俄罗斯方块游戏对象的引用
    private TetrisMachine machine;

    public TransformCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        //调用游戏机里的具体方法执行操作
        machine.transform();
    }
}
