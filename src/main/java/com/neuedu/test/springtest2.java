package com.neuedu.test;

import com.neuedu.pojos.Animal;
import com.neuedu.pojos.Car;
import com.neuedu.pojos.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springtest2 {
    @Test
    public void  test(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("config.xml");
        Car anmimal = (Car)classPathXmlApplicationContext.getBean("car");
        System.out.println(anmimal);
    }
}
