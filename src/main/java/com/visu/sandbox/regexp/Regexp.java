package com.visu.sandbox.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by visu0215 on 09.11.2017.
 */
public class Regexp {

    private static final String PATTERN = "\\{.+}.*";

    public static void main(String[] args) {
        String input = "{sdf}testString3\r";
        System.out.println(matchPattern(input) ? "true" : "false");
    }

    private static boolean matchPattern(String input) {
        Pattern algorithmPrefixPattern = Pattern.compile(PATTERN);
        Matcher m = algorithmPrefixPattern.matcher(input);
        return m.matches();
    }

/*    private static boolean algorithmProvided(String input) {
        Pattern algorithmPrefixPattern = Pattern.compile(PATTERN);
//        Pattern algorithmPrefixPattern = Pattern.compile("a*b");
        Matcher m = algorithmPrefixPattern.matcher(input);
        return m.matches();
    }

    private static String getStringFromPattern(String input) {
        Pattern pattern = Pattern.compile("\\{.+}");
        Matcher matcher = pattern.matcher(input);
        matcher.find();

        String algo = matcher.group();
        return algo.substring(1, algo.length() - 1);
    }

    private static String retrieveProcessedString(String input) {
        Pattern pattern = Pattern.compile("}.*");
        Matcher matcher = pattern.matcher(input);
        matcher.find();

        String string = matcher.group();
        return string.substring(1, string.length());
    }*/
}
