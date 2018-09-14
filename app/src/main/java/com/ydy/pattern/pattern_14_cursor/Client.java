package com.ydy.pattern.pattern_14_cursor;

/**
 * Author: ydy
 * Created: 2017/9/20 15:11
 * Description:
 */

public class Client {
    public static void main(String[] args) {
        ConcreteAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("Aige");
        aggregate.add("Studio\n");
        aggregate.add("SM");
        aggregate.add("Brother");
        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
