package com.ydy.pattern.pattern_07_stragety;

/**
 * Author: ydy
 * Created: 2017/9/12 15:38
 * Description:
 */

/**
 * 公交车价格计算策略
 */
public class BusStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }
}
