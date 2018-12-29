package com.neuedu.test;

import com.neuedu.pojos.Animal;
import com.neuedu.pojos.Car;
import com.neuedu.pojos.Carbean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

//两种读取配置文件的方式，BeanFactory加载配置文件，对象使用才创建，ApplicationContext加载使用前一次性创建
public class springtest1 {
    @Test
    public void  test(){
        //通过类路径读取配置文件
        //通过创建ApplicationContext对象读取文件
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过创建BeanFactory对象读取文件
//        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        Animal anmimal = (Animal)classPathXmlApplicationContext.getBean("Anmimal");
        System.out.println(anmimal);
        //关闭容器的方法
//      ((ClassPathXmlApplicationContext) classPathXmlApplicationContext).close();
    }

    @Test
    public void text(){
        //通过文件系统读取配置文件，文件可以存放在系统硬盘上
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("E:\\applicationContext.xml");
        Animal anmimal = (Animal)fileSystemXmlApplicationContext.getBean("Anmimal");
        System.out.println(anmimal);
    }

    @Test
    public void ret(){
        //该方法属于废弃方法，可以使用但是不建议使用，spring3以前是用该方法
        BeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Animal anmimal = (Animal)xmlBeanFactory.getBean("Anmimal");
        System.out.println(anmimal);
    }

    @Test
    public void tet(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car carbean = (Car) classPathXmlApplicationContext.getBean("Car");
        System.out.println(carbean);
    }
    @Test
    public void tt(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Carbean carbean = (Carbean) classPathXmlApplicationContext.getBean("Carbean");
        System.out.println(carbean);
    }
}
