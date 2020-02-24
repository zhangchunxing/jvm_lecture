package com.shengsiyuan.jvm.my.gc;

/**
 * -verbose:gc
 * -Xms20M
 * -Xmx20M
 * -Xmn10M
 * -XX:+PrintGCDetails
 * -XX:SurvivorRatio=8
 * -XX:MaxTenuringThreshold=1
 * -XX:+PrintTenuringDistribution
 * -XX:TargetSurvivorRatio=50
 * -XX:+UseSerialGC
 *
 *
 * @author: zhangchunxing
 * @create: 2019-06-02
 **/
public class MyTest1 {
    public static void main(String[] args) {
        int _1MB = 1024 * 1024;
        byte[] allocation1, allocation2, allocation3;
        // allocation1 = new byte[_1MB / 6];
        // 什么时候进入老年代取决于XX:MaxTenuringThreadshold设置
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
    }
}
