package com.ydy.pattern.pattern_14_cursor.simple;

/**
 * Author: ydy
 * Created: 2017/9/20 15:44
 * Description:
 */

/**
 * 容器类的接口
 */
public interface Company {
    /**
     * 返回一个迭代器对象
     * @return 迭代器对象
     */
    Iterator iterator();
}
