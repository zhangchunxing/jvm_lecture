package com.shengsiyuan.jvm.bytecode;

/**
 * @title: 53_通过字节码分析Java方法的静态分派与动态分派机制
 *
 *  方法的动态分派
 *
 *  方法的动态分派涉及到一个重要的概念：方法接收者。
 *  invokevirtual字节码指令的多态查找
 *  比较方法重载（overload）与方法重写（overwrite），我们是可以得到这样一个结论：
 *  方法重载是静态的，是编译期行为；方法重写是动态的，是运行期行为。
 *
 * @author: zhangchunxing
 * @create: 2018-11-26
 **/
public class MyTest6 {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();

        apple.test();
        orange.test();

        apple = new Orange();
        apple.test();


    }
}

class Fruit {
    public void test() {
        System.out.println("Fruit");
    }
}

class Apple extends Fruit {
    @Override
    public void test() {
        System.out.println("Apple");
    }
}

class Orange extends Fruit {
    @Override
    public void test() {
        System.out.println("Orange");
    }
}

