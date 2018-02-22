package com.visu.sandbox.pojo;

public class Pojo {
    private String s;
    private int i;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pojo pojo = (Pojo) o;

        if (i != pojo.i) return false;
        return s != null ? s.equals(pojo.s) : pojo.s == null;
    }

    @Override
    public int hashCode() {
        int result = s != null ? s.hashCode() : 0;
        result = 31 * result + i;
        return result;
    }
}
