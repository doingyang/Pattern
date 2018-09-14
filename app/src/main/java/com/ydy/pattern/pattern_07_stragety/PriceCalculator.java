package com.ydy.pattern.pattern_07_stragety;

/**
 * Author: ydy
 * Created: 2017/9/11 18:13
 * Description:
 */

public class PriceCalculator {
    //公交车类型
    private static final int BUS = 1;
    //地铁类型
    private static final int SUBWAY = 2;

    public static void main(String[] args){
        PriceCalculator calculator = new PriceCalculator();
        System.out.println("坐16公里公交车票价为：" + calculator.calculatePrice(16, BUS));
        System.out.println("坐16公里地铁票价为：" + calculator.calculatePrice(16, SUBWAY));
    }

    private int calculatePrice(int km, int type){
        if (type == BUS){
            return busPrice(km);
        } else if (type == SUBWAY){
            return subwayPrice(km);
        }
        return 0;
    }

    private int busPrice(int km){
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }

    private int subwayPrice(int km){
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
