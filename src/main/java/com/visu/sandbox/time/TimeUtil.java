package com.visu.sandbox.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeUtil {
    private TimeUtil() {}

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    private static final String DOUBLE_ZERO = "00";

    public static String getFormattedTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return DATE_FORMAT.format(calendar.getTime());
    }

    public static String getFormattedTimeInterval(long timeInterval) {
        long seconds = timeInterval / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;

        StringBuilder formatted =  new StringBuilder();
        append(formatted, days, " days ");
        append(formatted, hours % 24, "h ");
        append(formatted, minutes % 60, "m ");
        append(formatted, seconds % 60, "s");

        return formatted.toString();
    }

    private static void append(StringBuilder builder, long number, String postfix) {
        if (number != 0) {
            builder.append(number).append(postfix);
        } else if (builder.length() != 0) {
            builder.append(DOUBLE_ZERO).append(postfix);
        }
    }
}
