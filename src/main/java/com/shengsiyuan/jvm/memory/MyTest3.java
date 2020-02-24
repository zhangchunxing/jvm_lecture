package com.shengsiyuan.jvm.memory;

/**
 * @description: ${description}
 * @author: zhangchunxing
 * @create: 2019-03-21
 **/
public class MyTest3 {
    public static void main(String[] args) {
        new Thread(() -> A.method(), "Thread 1").start();
        new Thread(() -> B.method(), "Thread 2").start();

        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class A {
    public static synchronized void method() {
        System.out.println("method from A");

        try {
            Thread.sleep(5000);
            B.method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class B {
    public static synchronized void method() {
        System.out.println("method from B");

        try {
            Thread.sleep(5000);
            A.method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
