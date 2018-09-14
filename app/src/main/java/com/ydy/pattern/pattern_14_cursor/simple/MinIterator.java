package com.ydy.pattern.pattern_14_cursor.simple;

import java.util.List;

/**
 * Author: ydy
 * Created: 2017/9/20 15:37
 * Description:
 */

public class MinIterator implements Iterator {
    private List<Employee> list;
    private int position;

    public MinIterator(List<Employee> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return !(position > list.size() - 1 || list.get(position) == null);
    }

    @Override
    public Object next() {
        Employee employee = list.get(position);
        position++;
        return employee;
    }
}
