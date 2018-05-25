package com.visu.sandbox.string;

public class StringIntern {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "123";
        String str3 = new String("123");
        String str4 = String.valueOf("123");

        if (str1 == str2) {
            System.out.println("1 == 2");
        }

        if (str1 == str3) {
            System.out.println("1 == 3");
        }

        if (str1 == str4) {
            System.out.println("1 == 4");
        }

        if (str1.intern() == str3.intern()) {
            System.out.println("1 == 3 intern");
        }

        str3 = str3.intern();
        if (str1 == str3) {
            System.out.println("1 == 3 interned");
        }

    }
}
