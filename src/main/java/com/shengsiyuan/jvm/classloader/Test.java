package com.shengsiyuan.jvm.classloader;

public class Test {
    public static void main(String[] args) {
        String test1 = "ja" + "va";
        String test2 = "java";
        System.out.println(test1 == test2);

        final String str1 = "ja";
        final String str2 = "va";
        String str3 = str1 + str2;
        System.out.println(str1 + str2 == str3);

        String str4 = "ja";
        String str5 = "va";

        String str6 = str1 + str2;

        System.out.println(str4 + str5 == str6);
    }
}
