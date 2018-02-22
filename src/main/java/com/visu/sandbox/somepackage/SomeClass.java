package com.visu.sandbox.somepackage;

/**
 * Created by visu0215 on 20.10.2017.
 */
public class SomeClass {

    public static String someStaticField = InitClass.returnArg("super static field");

    static {
        System.out.println("super static block");
    }

    public SomeClass() {
        System.out.println("super constructor");
    }

    public String someField = InitClass.returnArg("super field");

    {
        System.out.println("super block");
    }

    public static void someStaticMethod() {
        System.out.printf("Super some static method");
    }

    public void someMethod() {
        System.out.println("Super some method");
    }
}
