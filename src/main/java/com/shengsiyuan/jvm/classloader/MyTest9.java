package com.shengsiyuan.jvm.classloader;

class Parent {
    static int a = 3;
    static {
        System.out.println("Parent static block");
    }

}

class Child extends Parent {
    
}
public class MyTest9 {
}
