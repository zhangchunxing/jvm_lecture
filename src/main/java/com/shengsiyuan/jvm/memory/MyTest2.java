package com.shengsiyuan.jvm.memory;

/**
 * @description: 虚拟机栈溢出
 * @author: zhangchunxing
 * @create: 2019-03-18
 **/
public class MyTest2 {
    private int length;

    public int getLength() {
        return length;
    }

    public void test() {
        this.length++;

        try {

            Thread.sleep(300);
        } catch (Exception e) {
            e.printStackTrace();
        }

        test();
    }
    public static void main(String[] args) {
        MyTest2 myTest2 = new MyTest2();
        try {
            myTest2.test();
        } catch (Throwable th) {
            System.err.println(myTest2.getLength());
            th.printStackTrace();
        }


    }
}
