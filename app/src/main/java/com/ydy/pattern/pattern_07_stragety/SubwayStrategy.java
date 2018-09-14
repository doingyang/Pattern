package com.ydy.pattern.pattern_07_stragety;

/**
 * Author: ydy
 * Created: 2017/9/12 15:39
 * Description:
 */

/**
 * 地铁价格计算策略
 */
public class SubwayStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        if (km < 6){
            return 3;
        } else if (km > 6 && km < 12 ){
            return 4;
        } else if (km > 12 && km < 22 ){
            return 5;
        } else if (km > 22 && km < 32 ){
            return 6;
        }
        return 7;
    }
}
