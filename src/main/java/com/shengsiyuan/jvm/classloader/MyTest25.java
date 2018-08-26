package com.shengsiyuan.jvm.classloader;

public class MyTest25 implements Runnable {
    private Thread thread;
    public MyTest25() {
        this.thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        ClassLoader classLoader = this.thread.getContextClassLoader();
        ClassLoader classLoader2 = this.thread.getClass().getClassLoader();
        System.out.println("Class: " + classLoader2);
        this.thread.setContextClassLoader(classLoader);

        System.out.println("Class: " + classLoader.getClass());
        System.out.println("Parent: " + classLoader.getParent().getClass());

    }

    public static void main(String[] args) {
        new MyTest25();
    }
}
