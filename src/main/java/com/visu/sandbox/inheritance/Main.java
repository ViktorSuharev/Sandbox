package com.visu.sandbox.inheritance;

public class Main {
    public static void main(String[] args) {
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();
        ClassA objAB = new ClassB();

        print(objA);
        print(objB);
        print(objAB);
    }

    private static void print(ClassA obj) {
        System.out.println(obj.methodI());
        System.out.println(obj.methodS());

        System.out.println(obj.i);
        System.out.println(obj.s);

        System.out.println("--- --- --- --- --- --- ---");
    }
}
