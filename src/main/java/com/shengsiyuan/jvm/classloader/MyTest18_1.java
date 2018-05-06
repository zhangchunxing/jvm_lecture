package com.shengsiyuan.jvm.classloader;

public class MyTest18_1 {
    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath( "C:\\Users\\85239\\Desktop\\");

        Class<?> clazz = loader1.loadClass("com.shengsiyuan.jvm.classloader.MyTest1");
        System.out.println(clazz.hashCode());
        System.out.println(clazz.getClassLoader());
    }
}
