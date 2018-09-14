package com.ydy.pattern.pattern_13_memorandum;

/**
 * Author: ydy
 * Created: 2017/9/19 18:49
 * Description:
 */

public class Client {
    public static void main(String[] args) {
        //构建游戏对象
        CallOfDuty game = new CallOfDuty();
        //1、打游戏
        game.play();
        //2、游戏存档
        Caretaker caretaker = new Caretaker();
        caretaker.archive(game.createMemoto());
        //3、退出游戏
        game.quit();
        //4、恢复游戏
        CallOfDuty newGame = new CallOfDuty();
        newGame.restore(caretaker.getMemoto());
    }
}
