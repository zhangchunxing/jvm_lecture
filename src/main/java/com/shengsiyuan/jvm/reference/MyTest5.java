package com.shengsiyuan.jvm.reference;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chunxingzhang
 * @date 2020/3/8
 */
public class MyTest5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        ThreadId.set(1);

        // IntStream.range(0, 5).forEach(item -> {
        //     executorService.execute(() -> {
        //         Thread thread = Thread.currentThread();
        //         Integer value1 = ThreadId.get();
        //         System.out.println(thread.getName()+" D "+value1);
        //         Random random = new Random();
        //         ThreadId.set(random.nextInt());
        //         Integer value2 = ThreadId.get();
        //         // System.out.println(thread.getName()+" D "+value2);
        //     });
        // });

    }
}
