package com.ydy.pattern.pattern_14_cursor.simple;

/**
 * Author: ydy
 * Created: 2017/9/20 14:53
 * Description:
 */

/**
 * 迭代器接口
 */
public interface Iterator {
    /**
     * 是否还有下一个元素
     */
    boolean hasNext();

    /**
     * 返回当前位置的元素并将位置移至下一位
     */
    Object next();
}
