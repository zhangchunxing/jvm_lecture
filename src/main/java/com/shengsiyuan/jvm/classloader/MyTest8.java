package com.shengsiyuan.jvm.classloader;

class FinalTest {
    public static final int x = 3;
    static {
        System.out.println("FinalTest static block invoke ");
    }

}


public class MyTest8 {
    public static void main(String[] args) {
        System.out.println(FinalTest.x);
    }
}
