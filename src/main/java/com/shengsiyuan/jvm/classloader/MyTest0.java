package com.shengsiyuan.jvm.classloader;

import java.util.Random;

public class MyTest0 {
    public static void main(String[] args) {
        System.out.println(IMyChild0.b);
    }
}

interface IMyParent0 {
    MyObject0 obj = new MyObject0();

    int b = new Random().nextInt(4);
}

interface IMyChild0 extends IMyParent0 {
    int a = new Random().nextInt(4);
}


