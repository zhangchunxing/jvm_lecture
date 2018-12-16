package com.shengsiyuan.jvm.bytecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: ${description}
 * @author: zhangchunxing
 * @create: 2018-11-20
 **/
public final class CaseInsensitiveString {
    private final String s;
    public CaseInsensitiveString(String s) {
        this.s = s;

    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }

        if (o instanceof String) {
            return s.equalsIgnoreCase((String) o);
        }

        return false;
    }

    public static void main(String[] args) {
        List<CaseInsensitiveString> list = new ArrayList<>();

        CaseInsensitiveString cas = new CaseInsensitiveString("PH");
        list.add(cas);

        System.out.println(list.contains("Ph"));


    }
}
