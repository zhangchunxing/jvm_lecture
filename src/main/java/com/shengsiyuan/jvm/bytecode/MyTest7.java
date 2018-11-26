package com.shengsiyuan.jvm.bytecode;

import java.util.Date;

/**
 * @title: 54_虚方法与动态分析分派机制详解
 *
 *
 *
 *
 * @author: zhangchunxing
 * @create: 2018-11-26
 **/
public class MyTest7 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.test("hello");
        dog.test("hello");
        dog.test(new Date());
    }
}

class Animal {
    public void test(String str) {
        System.out.println("animals str");
    }

    public void test(Date date) {
        System.out.println("animal date");
    }
}

class Dog extends Animal {
    @Override
    public void test(String str) {
        System.out.println("dog str");
    }

    @Override
    public void test(Date date) {
        System.out.println("dog date");
    }
}