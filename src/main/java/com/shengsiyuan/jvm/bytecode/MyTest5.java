package com.shengsiyuan.jvm.bytecode;

/**
 * 方法的静态分派。
 * Grandpa g1 = new Father();
 * 以上代码，g1的静态类型是Grandpa，而g1的实际类型（真正指向的类型）是Father。
 *
 * 我们可以得出这样一个结论：变量的静态类型是不会发生变化的，
 * 而实际类型则是可以发生变化的（多态的一种体现）。
 *
 * 实际类型是在运行期方可确定。
 *
 */
public class MyTest5 {
    // 方法重载是一种静态的行为
    public void test(Grandpa g) {
        System.out.println("Grandpa");
    }

    public void test(Father g) {
        System.out.println("Father");
    }

    public void test(Son g) {
        System.out.println("Son");
    }

    public static void main(String[] args) {
        Grandpa g1 = new Father();
        Grandpa g2 = new Son();

        MyTest5 myTest5 = new MyTest5();
        myTest5.test(g1);
        myTest5.test(g2);
    }
}

class Grandpa {

}

class Father extends Grandpa {

}

class Son extends Father {

}