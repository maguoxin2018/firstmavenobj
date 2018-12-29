package com.neuedu.test;

import com.neuedu.pojos.Boys;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class asdasd {
    //查询
    @Test
    public  void test() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatisfirst.xml");
            SqlSessionFactory s = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = s.openSession();
            List<Boys> selectall = sqlSession.selectList("selectall",null);
            System.out.println(selectall);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//添加
    @Test
    public void tset(){
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatisfirst.xml");
            SqlSessionFactory s = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = s.openSession();
            Boys boys = new Boys(4,"houz",5);
            int insert = sqlSession.insert("insert",boys);
            System.out.println(insert);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//  修改
    @Test
    public void text(){
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatisfirst.xml");
            SqlSessionFactory s = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = s.openSession();
            Boys boys = new Boys(null, "asd.xml",5);
            int update = sqlSession.update("update", boys);
            sqlSession.commit();
            System.out.println(update);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  // 删除
  @Test
  public void tes()
  {
      InputStream resourceAsStream = null;
      try {
          resourceAsStream = Resources.getResourceAsStream("mybatisfirst.xml");
          SqlSessionFactory s = new SqlSessionFactoryBuilder().build(resourceAsStream);
          SqlSession sqlSession = s.openSession();
          Boys boys = new Boys();
          boys.setId(4);
          int delete = sqlSession.update("delete", boys);
          sqlSession.commit();
          System.out.println(delete);
      } catch (IOException e) {
          e.printStackTrace();
      }
  }


}
