package com.ydy.pattern.pattern_11_command.simple;

/**
 * Author: ydy
 * Created: 2017/9/18 17:03
 * Description:
 */

/**
 * 接收者角色：俄罗斯方块游戏
 */
public class TetrisMachine {
    /**
     * 真正处理"向左"操作的逻辑代码
     */
    public void toLeft(){
        System.out.printf("向左\n");
    }

    /**
     * 真正处理"向右"操作的逻辑代码
     */
    public void toRight(){
        System.out.printf("向右\n");
    }

    /**
     * 真正处理"快速落下"操作的逻辑代码
     */
    public void fastToBottom(){
        System.out.printf("快速落下\n");
    }

    /**
     * 真正处理"改变形状"操作的逻辑代码
     */
    public void transform(){
        System.out.printf("改变形状");
    }
}
