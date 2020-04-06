package com.shengsiyuan.jvm.reference;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author chunxingzhang
 * @date 2020/3/8
 */
public class ThreadId {
    // Atomic integer containing the next thread ID to be assigned
    private static final AtomicInteger nextId = new AtomicInteger(0);

    // Thread local variable containing each thread's ID
    private static final ThreadLocal<Integer> threadId =
            ThreadLocal.withInitial(() -> nextId.getAndIncrement());

    // Returns the current thread's unique ID, assigning it if necessary
    public static int get() {
        return threadId.get();
    }

    public static void set(Integer value) {
        threadId.set(value);
    }


}
