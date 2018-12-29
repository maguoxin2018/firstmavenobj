package com.neuedu.test;

import com.neuedu.proxy.Argue;
import com.neuedu.proxy.Arguepos;
import com.neuedu.proxy.Arguepro;
import org.junit.Test;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class test {
//代理   不修改原有功能，在原有基础上拓展
    //静态代理   缺点占用资源
//    @Test
//    public void test(){
//        Argue argue = new Arguepro();
//        String talk = argue.talk();
//        System.out.println(talk);
//    }
//    动态代理   缺点目标对象必须实现接口
    @Test
    public void test(){
        //创建目标对象
        final Arguepos arguepos = new Arguepos();
        //创建代理对象
        Argue argue =(Argue)Proxy.newProxyInstance(arguepos.getClass().getClassLoader(), arguepos.getClass().getInterfaces()
                , new InvocationHandler() {
                    //内部类
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                         //执行目标对象的方法  //反射
                        Object invoke = method.invoke(arguepos, args);
                        String str = (String)invoke;
                        return str.toUpperCase();
                    }
                }
                );
        String talk = argue.talk();
        System.out.println(talk);
    }
}
