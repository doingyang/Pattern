package com.ydy.pattern.pattern_16_visitor;

/**
 * Author: ydy
 * Created: 2017/9/21 10:49
 * Description:
 */

public interface Visitor {
    // 访问工程师类型
    void visit(Engineer engineer);
    // 访问经理类型
    void visit(Manager manager);
}
