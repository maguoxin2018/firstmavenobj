package com.neuedu.pojos;

import javafx.scene.chart.ValueAxis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.io.Serializable;
@Component
public class Car implements Serializable {
    @Value("black")
    private String color;
    @Value("dodge")
    private String brand;
//    @Resource()
    //不加name先按照变量名去找，再按类名去找
    //加了name直接按照name去找
   @Autowired
   @Qualifier(value = "person")
    //不加name先按照变量名去找，再按类名去找,如果存在is-a的关系，按照value指定的变量名去找
    private Person person;

    public Car() {
    }

    public Car(String color, String brand, Person person) {
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", person=" + person +
                '}';
    }
}
