package com.shengsiyuan.jvm.my.gc;

/**
 * @description:
 * @author: zhangchunxing
 * @create: 2019-06-02
 **/
public class MyTest2 {
    public static void main(String[] args) {
        int _1MB = 1024 * 1024;
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_1MB / 6];
        // allocation1 + allocation2大于survivor空间一半
        allocation2 = new byte[_1MB / 6];
        allocation3 = new byte[4 * _1MB];
        allocation4 = new byte[4 * _1MB];
        allocation4 = null;
        allocation4 = new byte[4 * _1MB];

    }
}
