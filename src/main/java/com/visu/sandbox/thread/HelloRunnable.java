package com.visu.sandbox.thread;

public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from a HelloRunnable thread!");
    }

}