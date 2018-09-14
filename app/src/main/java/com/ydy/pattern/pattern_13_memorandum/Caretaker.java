package com.ydy.pattern.pattern_13_memorandum;

/**
 * Author: ydy
 * Created: 2017/9/19 18:47
 * Description:
 */

/**
 * 备忘录的操作者
 * 负责管理Memoto备忘录对象
 */
public class Caretaker {
    //备忘录
    Memoto memoto;
    /**
     * 存档
     */
    public void archive(Memoto memoto){
        this.memoto = memoto;
    }
    /**
     * 获取存档
     */
    public Memoto getMemoto(){
        return memoto;
    }
}
