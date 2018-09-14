package com.ydy.pattern.pattern_07_stragety;

/**
 * Author: ydy
 * Created: 2017/9/12 15:45
 * Description:
 */

/**
 * 交通工具出行价格计算器
 */
public class TrafficCalculator {
    public static void main(String[] args){
        TrafficCalculator calculator = new TrafficCalculator();
        //设置计算策略
        calculator.setStrategy(new BusStrategy());
        //计算价格
        System.out.println("坐16公里公交车票价为：" + calculator.calculatePrice(16));
//        calculator.setStrategy(new SubwayStrategy());
//        System.out.println("坐16公里地铁票价为：" + calculator.calculatePrice(16));
    }

    CalculateStrategy mStrategy;

    public void setStrategy(CalculateStrategy mStrategy){
        this.mStrategy = mStrategy;
    }

    public int calculatePrice(int km){
        return mStrategy.calculatePrice(km);
    }
}
