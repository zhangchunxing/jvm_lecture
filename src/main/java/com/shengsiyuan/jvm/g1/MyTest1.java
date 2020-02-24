package com.shengsiyuan.jvm.g1;

/**
 * @description: -verbose:gc -Xms10m -Xmx10m -XX:+UseG1GC -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+MaxGCPauseMillis=200m
 * @author: zhangchunxing
 * @create: 2019-09-05
 **/
public class MyTest1 {
    public static void main(String[] args) {
        int size = 1024 * 1024; // 代表1M
        byte[] myAlloc1 = new byte[size];
        byte[] myAlloc2 = new byte[size];
        byte[] myAlloc3 = new byte[size];
        byte[] myAlloc4 = new byte[size];

        System.out.println("hello world");
    }
}
