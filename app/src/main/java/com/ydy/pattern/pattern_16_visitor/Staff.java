package com.ydy.pattern.pattern_16_visitor;

/**
 * Author: ydy
 * Created: 2017/9/21 10:46
 * Description:
 */

import java.util.Random;

/**
 * 员工基类
 */
public abstract class Staff {
    // 员工姓名
    public String name;
    // 员工KPI
    public int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }
    // 接受Visitor的访问
    public abstract void accept(Visitor visitor);
}
