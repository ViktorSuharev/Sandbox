package com.visu.sandbox.jasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class Crypto {
    public static void main(String[] args) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword("safsdf");
        System.out.println(encryptor.encrypt("sdfsdf"));

        System.out.println("-----------------------");


        System.out.println(encryptor.decrypt("sdfsdf"));
    }
}
