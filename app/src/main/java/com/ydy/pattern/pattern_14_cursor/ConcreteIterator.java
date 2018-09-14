package com.ydy.pattern.pattern_14_cursor;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: ydy
 * Created: 2017/9/20 14:59
 * Description:
 */

/**
 * 具体迭代器类
 */
public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> list = new ArrayList<>();
    private int cursor = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public T next() {
        T obj = null;
        if (this.hasNext()){
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}
