package com.ydy.pattern.pattern_14_cursor.simple;

/**
 * Author: ydy
 * Created: 2017/9/20 15:37
 * Description:
 */

public class HuiIterator implements Iterator {
    private Employee[] array;
    private int position;

    public HuiIterator(Employee[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return !((position > (array.length - 1)) || (array[position] == null));
    }

    @Override
    public Object next() {
        Employee employee = array[position];
        position++;
        return employee;
    }
}
