package com.ydy.pattern.pattern_14_cursor;

/**
 * Author: ydy
 * Created: 2017/9/20 15:09
 * Description:
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 具体容器类
 */
public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<T>(list);
    }
}
