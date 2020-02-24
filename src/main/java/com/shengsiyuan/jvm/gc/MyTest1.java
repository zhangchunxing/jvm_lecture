package com.shengsiyuan.jvm.gc;

/**
 * -verbose:gc
 * -Xms20M
 * -Xmx20M
 * -Xmn10M
 * -XX:+PrintGCDetails
 * -XX:SurvivorRatio=8
 *
 *
 * @author: zhangchunxing
 * @create: 2019-05-08
 **/
public class MyTest1 {
    public static void main(String[] args) {
        int size = 1024 * 1024; // 代表1M
        byte[] myAlloc1 = new byte[2 * size];
        byte[] myAlloc2 = new byte[2 * size];
        byte[] myAlloc3 = new byte[2 * size];
        byte[] myAlloc4 = new byte[2 * size];

        System.out.println("hello world");
    }
}
