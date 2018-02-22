package com.visu.sandbox.yandex;

import java.util.ArrayList;
import java.util.List;

public class TrickyByte {
    public static void main(String[] args) {
        int a = 0xff;
        int b = 0xc0;
        int c = 0xfe;

        System.out.println(a);
        System.out.println(b);
        System.out.println( a - b);

        System.out.println(c);
        System.out.println(a & c);

        List<String> list = new ArrayList();
        list.equals(new Object());

        byte[] bytes = new byte[] { 0x01, 0x02, 0x03 };

        bytes.equals(new Object());
        System.out.println(bytes.hashCode());
    }
}
