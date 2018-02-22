package com.visu.sandbox.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pojo pojo = new Pojo();

        Set<Pojo> set = new HashSet<>();
        set.add(pojo);

        System.out.println("initial contains " + set.contains(pojo) + '\n');

        System.out.println("some actions...");
        pojo.setName("anotherName");

        System.out.println("after actions contains " + set.contains(pojo) + '\n');

        System.out.println("repair set actions...");
        set = new HashSet<>(set);

        System.out.println("finish contains " + set.contains(pojo));
    }
}
