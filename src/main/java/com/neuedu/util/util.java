package com.neuedu.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class util {

    public static SqlSession getSqlSession(){
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatisfirst.xml");
            SqlSessionFactory s = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = s.openSession();
            return sqlSession;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
