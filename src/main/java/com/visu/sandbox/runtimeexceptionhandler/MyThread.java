package com.visu.sandbox.runtimeexceptionhandler;

public class MyThread extends Thread {
    public void run(){
        System.out.println("MyThread running");
        throwException();
    }

    private static void throwException() {
        Integer a = 1;
        if (true) {
            a = null;
        }
        int x = 6;
        x=x/a;  // Exception here!
    }
}
