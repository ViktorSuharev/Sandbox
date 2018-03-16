package com.visu.sandbox.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Time {
    public static void main(String[] args) {
        long timeStamp = System.currentTimeMillis();

        System.out.println(convertMilliSecondsToFormattedDate(timeStamp));
        System.out.println(TimeUtil.getFormattedTime(timeStamp));
        System.out.println(TimeUtil.getFormattedTimeInterval(92000000L));
    }

    public static String dateFormat = "dd-MM-yyyy HH:mm:ss";
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);

    public static String convertMilliSecondsToFormattedDate(long milliSeconds){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliSeconds);
        return simpleDateFormat.format(calendar.getTime());
    }

}
