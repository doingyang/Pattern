package com.ydy.pattern.pattern_13_memorandum;

/**
 * Author: ydy
 * Created: 2017/9/19 18:35
 * Description:
 */

/**
 * 备忘录类：存储CallOfDuty对象的字段
 * 无状态、无操作的实体类，只用来存储备的一些数据，防止外部直接访问
 */
public class Memoto {
    public int mCheckPoint;// 关卡
    public int mLifeValue; // 人物的生命值
    public String mWeapon; // 武器

    @Override
    public String toString() {
        return "Memoto{" + "mCheckPoint=" + mCheckPoint + ", mLifeValue=" + mLifeValue + ", mWeapon='" + mWeapon + '\'' + '}';
    }
}
