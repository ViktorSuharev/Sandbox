package com.visu.sandbox.thread.syncstructure;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    private final static CountDownLatch latch = new CountDownLatch(10);

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println("Final countdown: " + latch.getCount());
                    Thread.sleep(1000L);
                    latch.countDown();
                } catch (InterruptedException e) {
                    System.out.println("Interrupted Exception happened");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Started");
            try {
                latch.await();
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception happened");
            }
            System.out.println("Finished!");
        });

        t1.start();
        t2.start();
    }
}
