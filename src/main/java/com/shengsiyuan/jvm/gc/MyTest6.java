package com.shengsiyuan.jvm.gc;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: zhangchunxing
 * @create: 2019-07-19
 **/
public class MyTest6 {

    public static void main(String[] args) {
        List<String> airlines = Arrays.asList("a", "b,c");
        List<String> products = Arrays.asList("meal,insurance", "ticket");
        List<String> methods = Arrays.asList("place,cancel", "refund,query");

    }




}
