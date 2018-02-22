package com.visu.sandbox.runtimeexceptionhandler;

import java.sql.Timestamp;

public class TryMe implements Thread.UncaughtExceptionHandler {
    Thread.UncaughtExceptionHandler oldHandler;

    public TryMe() {
        oldHandler = Thread.getDefaultUncaughtExceptionHandler(); // сохраним ранее установленный обработчик
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
//        oldHandler = Thread.getDefaultUncaughtExceptionHandler(); // сохраним ранее установленный обработчик
        System.err.println(getTimestamp() + thread.getName() + " " +  throwable.toString());
        if(oldHandler != null) // если есть ранее установленный...
            oldHandler.uncaughtException(thread, throwable); // ...вызовем его
        else {
            throwable.printStackTrace();
        }
    }

    private String getTimestamp() {
        return new Timestamp(System.currentTimeMillis()) + " ";
    }
}
