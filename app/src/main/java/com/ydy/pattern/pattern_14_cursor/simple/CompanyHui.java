package com.ydy.pattern.pattern_14_cursor.simple;

/**
 * Author: ydy
 * Created: 2017/9/20 15:46
 * Description:
 */

/**
 * 小辉的公司容器
 */
public class CompanyHui implements Company {
    private Employee[] array = new Employee[3];

    public CompanyHui() {
        array[0] = new Employee("小辉", 29, "男", "程序员");
        array[1] = new Employee("小红", 22, "男", "程序员");
        array[2] = new Employee("大哥", 36, "男", "程序员");
    }

    public Employee[] getEmployees(){
        return array;
    }

    @Override
    public Iterator iterator() {
        return new HuiIterator(array);
    }
}
