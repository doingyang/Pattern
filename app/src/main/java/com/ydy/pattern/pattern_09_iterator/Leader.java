package com.ydy.pattern.pattern_09_iterator;

/**
 * Author: ydy
 * Created: 2017/9/15 18:15
 * Description:
 */

/**
 * 抽象领导者
 */
public abstract class Leader {
    //上一级领导处理者
    protected Leader nextHandler;

    /**
     * 处理报账请求
     * @param money 能批复的报账额度
     */
    public final void handlerRequest(int money){
        if (money <= limit()){
            handle(money);
        } else {
            if (null != nextHandler){
                nextHandler.handlerRequest(money);
            }
        }
    }

    /**
     * 自身能批复的额度权限
     * @return 额度
     */
    public abstract int limit();

    /**
     * 处理报账行为
     * @param money 具体金额
     */
    public abstract void handle(int money);
}
