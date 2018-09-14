package com.ydy.pattern.pattern_16_visitor;

/**
 * Author: ydy
 * Created: 2017/9/21 10:49
 * Description:
 */

import java.util.Random;

/**
 * 工程师
 */
public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // 工程师这一年写的代码数量
    public int getCodeLines(){
        return new Random().nextInt(10 * 1000);
    }
}
