package com.ydy.pattern.pattern_07_stragety;

/**
 * Author: ydy
 * Created: 2017/9/12 15:36
 * Description:
 */

/**
 * 计算接口
 */
public interface CalculateStrategy {
    /**
     * 按距离来计算价格
     * @param km    公里
     * @return      返回价格
     */
    int calculatePrice(int km);
}
