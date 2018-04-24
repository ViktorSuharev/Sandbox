package com.visu.sandbox.iq;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class SmthIterable implements Iterable<String> {
    private List<String> list = Arrays.asList("first", "second");

    public Iterator<String> iterator() {
        Iterator<String> iprof = list.iterator();
        return iprof;
    }

    void testIterable() {
        for (String str : this) {
            System.out.println(str);
        }
    }
}
