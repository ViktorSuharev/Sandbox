package com.visu.sandbox.sortedset;

import java.util.Set;
import java.util.TreeSet;

public class SortedSet {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("eee");
        set.add("aaa");
        set.add("ddd");
        set.add("bbb");
        set.add("ccc");

        for (String setItem : set) {
            System.out.println(setItem);
        }
    }
}
