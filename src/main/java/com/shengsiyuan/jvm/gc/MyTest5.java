package com.shengsiyuan.jvm.gc;

/**
 * -verbose:gc
 * -Xms20M
 * -Xmx20M
 * -XX:+PrintGCDetails
 * -XX:SurvivorRatio=8
 * -XX:+UseConcMarkSweepGC
 *
 *
 * @description: CMS收集器
 * @author: zhangchunxing
 * @create: 2019-06-09
 **/
public class MyTest5 {
    public static void main(String[] args) {
        int size = 1024 * 1024; // 代表1M
        byte[] myAlloc1 = new byte[4 * size];
        System.err.println("1111");
        byte[] myAlloc2 = new byte[4 * size];
        System.err.println("2222");
        byte[] myAlloc3 = new byte[4 * size];
        System.err.println("3333");
        byte[] myAlloc4 = new byte[2 * size];
        System.err.println("4444");

        System.out.println("hello world");
    }
}
