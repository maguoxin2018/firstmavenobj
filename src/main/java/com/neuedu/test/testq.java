package com.neuedu.test;


import com.neuedu.dao.*;
import com.neuedu.pojos.Boys;
import com.neuedu.pojos.Empl;
import com.neuedu.pojos.Orders;
import com.neuedu.pojos.User;
import com.neuedu.util.util;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import java.util.List;

public class testq {
//    @Test
//    public void test(){
//        asDao as = new asDaoImp();
//        List<Boys> h = ((asDaoImp) as).qwe("h");
//        System.out.println(h);
//    }
    @Test
    public  void test(){
        SqlSession sqlSession = util.getSqlSession();
        asDao mapper = sqlSession.getMapper(asDao.class);
        Boys boys =new Boys();
        boys.setUsercp(5);
        boys.setBoyname("houz");
        boys.setId(4);
        System.out.println(boys);
        List<Boys> more = mapper.more(boys);
        System.out.println(more);
    }
    @Test
    public void test1(){
        SqlSession sqlSession = util.getSqlSession();
        OrdersDao mapper = sqlSession.getMapper(OrdersDao.class);
        List<Orders> getmessage = mapper.getmessage(3);
        System.out.println(getmessage);
    }
    @Test
    public void test2(){
        SqlSession sqlSession = util.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> getorders = mapper.getorders(1);
        System.out.println(getorders);
    }

}
