package com.visu.sandbox.statictest;

public class Main {
    public static void main(String[] args) {
        method(new Integer(5));
    }
    public static void method(Object o) {
        System.out.println("Object impl");
    }
    public static void method(String s) {
        System.out.println("String impl");
    }
}