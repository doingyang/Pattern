package com.ydy.pattern.pattern_14_cursor.simple;

/**
 * Author: ydy
 * Created: 2017/9/20 15:32
 * Description:
 */

/**
 * 员工类
 */
public class Employee {
    // 姓名
    private String name;
    // 年龄
    private int age;
    // 性别
    private String sex;
    // 职位
    private String position;

    public Employee(String name, int age, String sex, String position) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'' + ", position='" + position + '\'' + '}';
    }
}
