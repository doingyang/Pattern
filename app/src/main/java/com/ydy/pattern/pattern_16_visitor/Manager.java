package com.ydy.pattern.pattern_16_visitor;

import java.util.Random;

/**
 * Author: ydy
 * Created: 2017/9/21 10:55
 * Description:
 */

/**
 * 经理
 */
public class Manager extends Staff {
    // 产品数量
    private int products;
    public Manager(String name) {
        super(name);
        products = new Random().nextInt(10);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // 一年内做的产品数量
    public int getProducts(){
        return products;
    }
}
