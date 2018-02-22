package com.visu.sandbox.log4j.reconfigure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by visu0215 on 11.09.2017.
 */
public class Test {
    public static void main(String[] args) {
/*
        List list = new ArrayList();
        list.add("String1");
        list.add("String2");
        list.add(BigInteger.ONE);
        System.out.println(list.size());
        for (Iterator iter = list.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
*/

        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        System.out.println(map.get("key"));


        List<String> list = new ArrayList<>();
        list.add("5");
        list.add("a4");
        list.add("3");
        list.add("2");
        list.add("a1");
        Collections.sort(list, Comparator.naturalOrder());


        list
                .stream()
                .sorted()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);

        list.forEach(System.out::println);
        System.out.println(list);



        int [] array = new int[10];
        array[0] = 5;
        array[0] = 2;
        array[0] = 4;
        array[0] = 1;
        array[0] = 3;
        Arrays.sort(array);
        System.out.println(array.toString());



      /*  Converter<String, Integer> converter = new Converter() {
            @Override
            public void conver
        }*/


/*        Configurator.setLevel("org.apache.logging.log4j.core.LoggerContext", Level.ALL);

        // You can also set the root logger:
        Configurator.setRootLevel(Level.ALL);

        LOGGER.info("start");

        LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
        ((org.apache.logging.log4j.core.LoggerContext) context).reconfigure();*/


    }
}
