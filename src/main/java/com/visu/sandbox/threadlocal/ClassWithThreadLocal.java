package com.visu.sandbox.threadlocal;

import java.util.concurrent.atomic.AtomicInteger;

public class ClassWithThreadLocal {
    private static final AtomicInteger nextId = new AtomicInteger(0);
    private final ThreadLocal<Integer> threadId = ThreadLocal.withInitial(nextId::getAndIncrement);

    public int get() {
        return threadId.get();
    }

    public void set(Integer value) {
        threadId.set(value);
    }
}
