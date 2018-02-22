package com.visu.sandbox.comparable;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("ddd");
        stringSet.add("aaa");
        stringSet.add("ccc");
        stringSet.add("bbb");

        stringSet.forEach((item) -> System.out.println(item));


        Set<Pojo> pojoSet = new TreeSet<>(Comparator.comparing(Pojo::getName));
//        Set<Pojo> pojoSet = new TreeSet<>((Pojo a, Pojo b) -> -a.getName().compareTo(b.getName()));

        for (int i = 0; i < 4; ++i) {
            Pojo pojo = new Pojo(1, String.valueOf(i));
            pojoSet.add(pojo);
        }

        pojoSet.forEach((item) -> System.out.println(item));


        System.out.println((byte)0x00);
        System.out.println((byte)0x9F);
    }
}
