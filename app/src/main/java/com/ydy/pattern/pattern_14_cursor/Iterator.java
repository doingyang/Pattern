package com.ydy.pattern.pattern_14_cursor;

/**
 * Author: ydy
 * Created: 2017/9/20 14:53
 * Description:
 */

/**
 * 迭代器接口
 */
public interface Iterator<T> {
    /**
     * 是否还有下一个元素
     * @return true表示有，false表示没有
     */
    boolean hasNext();

    /**
     * @return 返回当前位置的元素并将位置移至下一位
     */
    T next();
}
