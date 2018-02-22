package com.visu.sandbox.somepackage;

/**
 * Created by visu0215 on 20.10.2017.
 */
public class ExtendedSomeClass extends SomeClass {

    public static String someStaticField = InitClass.returnArg("child static field");

    static {
        System.out.println("child static block");
    }

    public ExtendedSomeClass() {
        System.out.println("child constructor");
    }

    public String someField = InitClass.returnArg("child field");

    {
        System.out.println("child block");
    }

    public static void someStaticMethod() {
        System.out.println("Child some static method");
    }

    @Override
    public void someMethod() {
        System.out.println("Child some method");
    }
}
