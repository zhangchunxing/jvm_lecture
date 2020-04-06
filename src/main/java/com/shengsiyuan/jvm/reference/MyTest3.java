package com.shengsiyuan.jvm.reference;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/**
 * @author chunxingzhang
 * @date 2020/3/1
 */
public class MyTest3 {
    public static void main(String[] args) {
        MyObj date = new MyObj();
        WeakReference<MyObj> weakReference = new WeakReference<>(date);

        date = null;

        System.out.println(weakReference.get());

        System.gc();

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MyObj date1 = weakReference.get();
        System.out.println(date1);
    }

    private static class MyObj {

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("myobj will be gc");
        }
    }
}
