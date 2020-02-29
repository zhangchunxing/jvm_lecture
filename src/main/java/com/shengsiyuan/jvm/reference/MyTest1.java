package com.shengsiyuan.jvm.reference;

import java.lang.ref.SoftReference;
import java.util.Date;

/**
 * Reference实例的4种状态：
 * Active,Pending,Enqueued,Inactive
 *
 * Active：新创建的Reference实例都会处于Active状态
 * Pending：未被注册到引用队列的引用对象不可能处于该状态下
 * Enqueued：未被注册到用队列的引用对象不可能处于该状态下
 * Inactive:无法对该状态的引用对象执行任何操作，处于该状态下的对象状态不会再发生任何变化
 *
 * @author chunxingzhang
 * @date 2019/12/8
 */
public class MyTest1 {
    public static void main(String[] args) {
        Date date = new Date();
        SoftReference<Date> reference1 = new SoftReference<>(date);

        Date date1 = reference1.get();

        if (null != date1) {
            System.out.println("hello");
        } else {
            System.out.println("world");
        }

        System.out.println("=======");

        reference1.clear();

        Date date2 = reference1.get();

        System.out.println(date2);


    }
}
