package com.visu.sandbox.runtimeexceptionhandler;

public class MainActivity {

    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new TryMe());
        Thread myThread = new MyThread();
        myThread.start();
    }
}
