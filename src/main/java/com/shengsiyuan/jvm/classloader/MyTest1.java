package com.shengsiyuan.jvm.classloader;

/**
 * 对于静态字段来说，只有直接定义了该字段的类才会被初始化，
 * 当一个类初始化时，要求其父类全部都已经初始化完毕了。
 *
 * -XX:+TraceClassLoading，用于追踪类的加载信息并打印。
 * -XX:+TraceClassUnLoading，用于追踪类的卸载信息并打印。
 */
public class MyTest1 {
    public static void main(String[] args) {
        System.out.println(MyChild1.str2);
    }
}

class MyParent1 {
    public static String str = "hello world";

    static {
        System.out.println("MyParent1 static block");
    }

}

class MyChild1 extends MyParent1 {
    public static String str2 = "welcome";
    static {
        System.out.println("MyChild1 static block");
    }
}
