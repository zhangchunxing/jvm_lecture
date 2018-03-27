package com.shengsiyuan.jvm.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * 自定义类加载器
 */
public class MyTest16 extends ClassLoader {
    private String classLoaderName;

    private final String fileExtension = ".class";

    public MyTest16(String classLoaderName) {
        super();
        this.classLoaderName = classLoaderName;
    }

    public MyTest16(ClassLoader parent, String classLoaderName) {
        super(parent);
        this.classLoaderName = classLoaderName;
    }

    @Override
    public Class<?> findClass(String name) {
        byte[] b = loadClassData(name);
        return defineClass(name, b, 0, b.length);
    }



    private byte[] loadClassData(String name) {
        // load the class data from the connection
        //FileInputStream is = null;
        byte[] data = null;
        //  ByteArrayOutputStream baos = null;
        try(FileInputStream is =
                    new FileInputStream(new File(name + this.fileExtension));
            ByteArrayOutputStream baos =
                    new ByteArrayOutputStream()) {
            this.classLoaderName = this.classLoaderName.replace(".", "\\");

            //is = new FileInputStream(new File(name + this.fileExtension));

            //baos = new ByteArrayOutputStream();
            int ch = 0;

            while (-1 != (ch = is.read())) {
                baos.write(ch);
            }

            data = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    @Override
    public String toString() {
        return "MyTest16{" +
                "classLoaderName='" + classLoaderName + '\'' +
                ", fileExtension='" + fileExtension + '\'' +
                '}';
    }

    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");

        test(loader1);
    }

    public static void test(ClassLoader classLoader) throws Exception {
        Class<?> clazz = classLoader.loadClass("com.shengsiyuan.jvm.classloader.MyTest1");

        Object object = clazz.newInstance();

        System.out.println(object);

    }

}
