package com.ydy.pattern.pattern_11_command.simple;

/**
 * Author: ydy
 * Created: 2017/9/18 17:27
 * Description:
 */

public class Player {
    public static void main(String[] args) {
        // 首先，要有俄罗斯方块游戏
        TetrisMachine machine = new TetrisMachine();
//        //要实现怎样的控制方式，直接调用相关的函数就行（这种方式不推荐使用！后来者不方便维护）
//        machine.toLeft();
//        machine.toRight();
//        machine.fastToBottom();
//        machine.transform();

        // 根据游戏我们构造4种命令
        LeftCommand leftCommand = new LeftCommand(machine);
        RightCommand rightCommand = new RightCommand(machine);
        FallCommand fallCommand = new FallCommand(machine);
        TransformCommand transformCommand = new TransformCommand(machine);

        // 按钮执行不同的命令
        Buttons buttons = new Buttons();
        buttons.setLeftCommand(leftCommand);
        buttons.setRightCommand(rightCommand);
        buttons.setFallCommand(fallCommand);
        buttons.setTransformCommand(transformCommand);

        // 由玩家决定具体按下哪个按钮
        buttons.toLift();
        buttons.toRight();
        buttons.fall();
        buttons.transform();
    }
}
