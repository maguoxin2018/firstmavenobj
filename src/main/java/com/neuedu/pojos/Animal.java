package com.neuedu.pojos;

public class Animal {
    private Integer id;
    private String name;
    private String kind;

    public Animal() {
    }

    public Animal(Integer id, String name, String kind) {
        this.id = id;
        this.name = name;
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
