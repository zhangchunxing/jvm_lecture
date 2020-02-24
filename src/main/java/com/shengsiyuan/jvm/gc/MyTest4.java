package com.shengsiyuan.jvm.gc;

/**
 * -verbose:gc
 * -Xmx200M
 * -Xmn50M
 * -XX:TargetSurvivorRatio=60
 * -XX:+PrintTenuringDistribution
 * -XX:+PrintGCDetails
 * -XX:+PrintGCDateStamps
 * -XX:+UseConcMarkSweepGC 【打开次开关后，使用ParNew+CMS+Serial Old的收集器组合】
 * -XX:+UseParNewGC
 * -XX:MaxTenuringThreshold=3
 *
 *
 * @author: zhangchunxing
 * @create: 2019-05-26
 **/
public class MyTest4 {
    public static void main(String[] args) throws InterruptedException {
        byte [] byte_1 = new byte[512 * 1024];
        byte [] byte_2 = new byte[512 * 1024];

        myGc();
        Thread.sleep(1000);

        System.out.println("11111");

        myGc();
        Thread.sleep(1000);

        System.out.println("22222");

        myGc();
        Thread.sleep(1000);

        System.out.println("33333");

        myGc();
        Thread.sleep(1000);

        System.out.println("44444");

        byte [] byte_3 = new byte[1024 * 1024];
        byte [] byte_4 = new byte[1024 * 1024];
        byte [] byte_5 = new byte[1024 * 1024];

        myGc();
        Thread.sleep(1000);

        System.out.println("55555");

        myGc();
        Thread.sleep(1000);

        System.out.println("66666");

        System.out.println("hello world");




    }

    private static void myGc() {
        for (int i = 0; i < 40; ++i) {
            byte[] byteArray = new byte[1024 * 1024];
        }
    }
}
