package com.visu.sandbox.string.tostring;

import java.util.Objects;

public class Data {
    private String str;
    private int num;

    public Data(String str, int num) {
        this.str = str;
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Data{" +
                "str='" + str + '\'' +
                ", num=" + num +
                '}';
    }
}
