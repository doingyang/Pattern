package com.ydy.pattern.pattern_09_iterator;

/**
 * Author: ydy
 * Created: 2017/9/15 17:35
 * Description:
 */

/**
 * 抽象处理者
 */
public abstract class Dealer {
    //下一节点的处理者
    protected Dealer successor;

    /**
     * 请求处理
     * @param condition 请求条件
     */
    public abstract void dealRequest(String condition);
}
