package com.neuedu.pojos;

import java.io.Serializable;
import java.util.Arrays;

public class Carbean implements Serializable {
    private String color;
    private String brand;
    private Person[] person;

    public Carbean() {
    }

    public Carbean(String color, String brand, Person[] person) {
        this.color = color;
        this.brand = brand;
        this.person = person;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Carbean{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", person=" + Arrays.toString(person) +
                '}';
    }
}
