package com.shengsiyuan.jvm.memory;

/**
 * @description: 运行时常量池溢出，OOM
 * @author: zhangchunxing
 * @create: 2019-04-13
 **/
public class MyTest6 {
    public static void main(String[] args) {
        // jdk 1.7开始，常量池移到了堆上，所以
        // 运行时常量池溢出会导致，OOM
        // List<String> stringList = new ArrayList<>();
        // int i = 0;
        // while (true) {
        //     stringList.add(String.valueOf(i++).intern());
        // }
        String str1 = new String("hello");
        String str2 = "hello";
        System.out.println(str1.intern() == str2);

    }
}
