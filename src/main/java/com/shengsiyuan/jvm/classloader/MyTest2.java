package com.shengsiyuan.jvm.classloader;

/**
 * 注意：这里指的是将常量放到了MyTest2的常量池中，之后MyTest2与MyParent2就没有任何联系了
 * 甚至我可以将MyParent2的class文件删除.
 *
 * 助记符：
 * ldc表示将int,float或是String类型的常量值从常量池中推送至栈顶,
 * bipush表示将单字节(-128~127)的常量值推送至栈顶,
 * sipush表示将一个短整型常量值（-32768~32767）推送至栈顶,
 * iconst_1表示将int类型的数字1推送至栈顶(iconst_m1 ~ iconst_5)
 *
 * iconst_m1表示将int类型的数字-1推送至栈顶
 */

public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyParent2.str);
    }
}

class MyParent2 {
    public static final String str = "hello world";
    public static final short s = 7;
    public static final int i = 128;
    public static final int m = 1;
    static {
        System.out.println("MyParent2 static block");
    }
}