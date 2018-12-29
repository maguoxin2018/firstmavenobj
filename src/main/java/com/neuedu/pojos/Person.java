package com.neuedu.pojos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.Serializable;



//当时用注解后面没有加任何东西时所默认代表 value=类名首字母小写
@Component(value = "person")
//@Repository   注解的作用一样，用的地方存在差异   相对应mvc的每一层
//@Controller
//@Service
//相当于在配置文件中写<bean id="person" class="com.neuedu.pojos"></bean>
public class Person implements Serializable {
    @Value("houwu")
    private String name;
    @Value("nv")
    private String sex;
    @Value("5")
    private String driveyears;

    public Person() {
    }

    public Person(String name, String sex, String driveyears) {
        this.name = name;
        this.sex = sex;
        this.driveyears = driveyears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDriveyears() {
        return driveyears;
    }

    public void setDriveyears(String driveyears) {
        this.driveyears = driveyears;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", driveyears='" + driveyears + '\'' +
                '}';
    }
}
