package com.visu.sandbox.logmdc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class MdcExample {
    private static final Logger logger = LogManager.getLogger("SampleLogger");

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        try {
            runThread("subscriber1", "session1");
            runThread("subscriber2", "session2");
            runThread("subscriber3", "session3");
            runThread("subscriber4", "session4");
            runThread("subscriber5", "session5");
        } finally {
            ThreadContext.clearAll();
        }
    }

    private static void runThread(String subsriberId, String sessionId) {
        ThreadContext.put("subscriber.id", subsriberId);
        ThreadContext.put("session.id", sessionId);
        // execute some logic
        logger.info("Some log message with parameter: {}.", "parameter");
        // execute some logic
    }
}
