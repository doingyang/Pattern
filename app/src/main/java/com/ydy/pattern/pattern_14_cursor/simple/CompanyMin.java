package com.ydy.pattern.pattern_14_cursor.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: ydy
 * Created: 2017/9/20 15:46
 * Description:
 */

/**
 * 小明的公司容器
 */
public class CompanyMin implements Company {
    private List<Employee> list = new ArrayList<>();

    public CompanyMin() {
        list.add(new Employee("小明", 26, "男", "程序员"));
        list.add(new Employee("小芸", 22, "女", "测试"));
        list.add(new Employee("小方", 18, "男", "测试"));
        list.add(new Employee("可儿", 21, "女", "设计"));
    }

    public List<Employee> getEmployees(){
        return list;
    }

    @Override
    public Iterator iterator() {
        return new MinIterator(list);
    }
}
