package com.shengsiyuan.jvm.gc;

/**
 * @description:
 * @author: zhangchunxing
 * @create: 2019-05-22
 **/
public class MyTest3 {

    public static void main(String[] args) {
        int size = 1024 * 1024; // 代表1M
        byte[] myAlloc1 = new byte[2 * size];
        byte[] myAlloc2 = new byte[2 * size];
        byte[] myAlloc3 = new byte[2 * size];
        byte[] myAlloc4 = new byte[2 * size]; // gc

        System.out.println("hello world");
    }
}
