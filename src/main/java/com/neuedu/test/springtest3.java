package com.neuedu.test;

import com.neuedu.pojos.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;

//标明是一个spring的测试类
@RunWith(SpringJUnit4ClassRunner.class)
//是用来读取配置文件
@ContextConfiguration(locations = "classpath:config.xml")
public class springtest3 {
    @Resource
    private Car car;
    @Test
    public void test(){
        System.out.println(car);
        System.out.println("aksudg");
    }
}
