package com.ydy.pattern.pattern_13_memorandum;

/**
 * Author: ydy
 * Created: 2017/9/19 18:19
 * Description:
 */

/**
 * 游戏类：使命召唤
 */
public class CallOfDuty {
    // 关卡
    private int mCheckPoint = 1;
    // 人物的生命值
    private int mLifeValue = 100;
    // 武器
    private String mWeapon = "沙漠之鹰";
    /**
     * 玩游戏：对关卡和生命值进行修改
     */
    public void play(){
        System.out.println("玩游戏：" + String.format("第%d关", mCheckPoint) + " 奋战杀敌中");
        mLifeValue -= 10;
        System.out.println("进度升级啦");
        mCheckPoint++;
        System.out.println("到达 " + String.format("第%d关", mCheckPoint));
    }
    /**
     * 退出游戏
     */
    public void quit(){
        System.out.println("---------------------");
        System.out.println("退出前的游戏属性：" + this.toString());
        System.out.println("退出游戏");
        System.out.println("---------------------");
    }
    /**
     * 创建备忘录：将自身的状态保存到一个Memoto对象中
     */
    public Memoto createMemoto(){
        Memoto memoto = new Memoto();
        memoto.mCheckPoint = mCheckPoint;
        memoto.mLifeValue = mLifeValue;
        memoto.mWeapon = mWeapon;
        return memoto;
    }
    /**
     * 恢复游戏：将CallOfDuty对象的状态从备忘录对象中恢复
     */
    public void restore(Memoto memoto){
        this.mCheckPoint = memoto.mCheckPoint;
        this.mLifeValue = memoto.mLifeValue;
        this.mWeapon = memoto.mWeapon;
        System.out.println("恢复后的游戏属性：" + this.toString());
    }
    // setter 和 getter

    @Override
    public String toString() {
        return "CallOfDuty{" + "mCheckPoint=" + mCheckPoint + ", mLifeValue=" + mLifeValue + ", mWeapon='" + mWeapon + '\'' + '}';
    }
}
