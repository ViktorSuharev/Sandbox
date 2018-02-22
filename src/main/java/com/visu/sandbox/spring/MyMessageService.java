package com.visu.sandbox.spring;

public class MyMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "My message service";
    }
}
