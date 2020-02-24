package com.shengsiyuan.jvm.my;

/**
 * @description:
 * @author: zhangchunxing
 * @create: 2019-07-30
 **/
public class Test {

    static int min(int... args) {
        // if (args.length == 0)
        //     throw new IllegalArgumentException("Too few arguments");

        int min = Integer.MIN_VALUE;
        for (int i = 1; i < args.length; i++)
            if (args[i] < min)
                min = args[i];

        return min;
    }

    public static void main(String[] args) {
        System.out.println("中国");
    }
}
