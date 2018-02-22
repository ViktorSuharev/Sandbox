package com.visu.sandbox.sets;

import java.util.Objects;

public class Pojo {
    private int id = 1;
    private String name = "name";

    public Pojo() {
    }

    public Pojo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pojo pojo = (Pojo) o;
        return id == pojo.id &&
                Objects.equals(name, pojo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
