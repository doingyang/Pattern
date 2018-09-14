package com.ydy.pattern.pattern_14_cursor.simple;

/**
 * Author: ydy
 * Created: 2017/9/20 15:54
 * Description:
 */

public class Boss {
    public static void main(String[] args) {
        CompanyMin min = new CompanyMin();
        check(min.iterator());
        CompanyHui hui = new CompanyHui();
        check(hui.iterator());
    }

    private static void check(Iterator iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
