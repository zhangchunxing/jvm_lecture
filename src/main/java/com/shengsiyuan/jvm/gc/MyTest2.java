package com.shengsiyuan.jvm.gc;

/**
 * @description:
 * @author: zhangchunxing
 * @create: 2019-05-21
 **/
public class MyTest2 {
    public static void main(String[] args) {
        int size = 1024*1024;
        byte myAlloc[] = new byte[5 * size];
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
