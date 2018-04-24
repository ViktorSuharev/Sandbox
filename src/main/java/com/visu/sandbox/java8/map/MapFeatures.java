package com.visu.sandbox.java8.map;

import java.util.HashMap;
import java.util.Map;

public class MapFeatures {

    private static Map<String, Integer> map = new HashMap<String, Integer>() {{
            put("a", 1); put("b", 2);
        }};

    public static void main(String[] args) {
/*        incrementExistentValue();
        incrementNonExistentValue();*/

        printPair("a");
        printPair("c");
        map.merge("a", 1, Integer::sum);
        map.merge("c", 1, Integer::sum);
        printPair("a");
        printPair("c");


        Map<String, Map<String, Integer>> parentMap = new HashMap<>();
        String parentKey = "parentKey";
        String childKey = "childKey";

        Map<String, Integer> tmpMap = new HashMap<>();
        tmpMap.put(childKey, 1);
        parentMap.put(parentKey, tmpMap);

        Map<String, Integer> childMap = parentMap.computeIfAbsent(parentKey, (k) -> new HashMap<>());
        childMap.merge(childKey, 1, Integer::sum);

        System.out.println("value is " + parentMap.get(parentKey).get(childKey));

    }

    private static void incrementExistentValue() {
        incrementValue("a");
    }

    private static void incrementNonExistentValue() {
        incrementValue("c");
    }

    private static void incrementValue(String key) {
        printPair(key);

        int counter = 1;
        if (map.get(key) != null) {
            counter += map.get(key);
        }
        map.put(key, counter);

        printPair(key);
    }

    private static void printPair(String key) {
        System.out.println("key: " + key + "; value: " + map.get(key));
    }
}
