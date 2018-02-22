package com.visu.sandbox.threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ClassWithThreadLocal classWithThreadLocal = new ClassWithThreadLocal();

/*        for (int i = 0; i < 10; ++i) {
            final int k = i;
            Thread thread = new Thread(() -> threadLogic(classWithThreadLocal, k));
            thread.start();
        }*/

        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            final int k = i;
            service.submit(() -> threadLogic(classWithThreadLocal, k));
        }
        service.shutdown();
    }

    private static void threadLogic(ClassWithThreadLocal lct, int k) {
        lct.set(k);
        System.out.println(lct.get());
    }
}
