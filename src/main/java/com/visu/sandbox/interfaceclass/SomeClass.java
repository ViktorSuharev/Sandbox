package com.visu.sandbox.interfaceclass;

public class SomeClass implements SomeInterface {

    public void someMethod() throws RuntimeException {
        System.out.println("some method");
        middleMethod();
    }

    private void middleMethod() {
        illegalArgumentMethod();
    }

    private void illegalArgumentMethod() {
        throw new IllegalArgumentException();
    }
}
