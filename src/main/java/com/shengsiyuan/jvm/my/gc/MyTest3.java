package com.shengsiyuan.jvm.my.gc;

/**
 * @description: -Xms20M –Xmx20M –Xmn10M –XX:+UseSerialGC
 * @author: zhangchunxing
 * @create: 2019-06-02
 **/
public class MyTest3 {
    public static void main(String[] args) throws Exception {
        GCMemoryObject object1 = new GCMemoryObject(2);
        GCMemoryObject object2 = new GCMemoryObject(8);
        GCMemoryObject object3 = new GCMemoryObject(8);
        GCMemoryObject object4 = new GCMemoryObject(8);
        object2 = null;
        object3 = null;
        GCMemoryObject object5 = new GCMemoryObject(8);
        Thread.sleep(4000);
        object2 = new GCMemoryObject(8);
        object3 = new GCMemoryObject(8);
        object2 = null;
        object3 = null;
        object5 = null;
        GCMemoryObject object6 = new GCMemoryObject(8);
        Thread.sleep(5000);
    }
}

class GCMemoryObject {
    private byte[] bytes = null;

    public GCMemoryObject(int multi) {
        bytes = new byte[1024 * 256 * multi];
    }
}