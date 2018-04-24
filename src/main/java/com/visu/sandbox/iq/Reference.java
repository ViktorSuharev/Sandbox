package com.visu.sandbox.iq;

import java.util.ArrayList;
import java.util.List;

public class Reference {
    static Integer i = 0;

    public static void main(String[] args) {
        passVolatileParam(i);
        System.out.println(i);
        passVolatileParam(i);
        System.out.println(i);

        List<String> a = new ArrayList<>();
        preventNpeMethod1(a);
        preventNpeMethod2(a);

        SmthIterable smthIterable = new SmthIterable();
        smthIterable.testIterable();
    }

    static void passVolatileParam(Integer i) {
        ++i;
    }

    static void preventNpeMethod1(List<String> a) {
        if (a != null && a.size() > 0) {
            System.out.println("first is successful");
        }
    }

    static void preventNpeMethod2(List<String> a) {
        if (a != null & a.size() > 0) {
            System.out.println("second is successful");
        }
    }

}
