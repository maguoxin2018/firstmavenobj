package com.neuedu.test;

import com.neuedu.dao.EmplDao;
import com.neuedu.pojos.Empl;
import com.neuedu.util.util;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;



import java.util.List;

public class zzzz {
    @Test
    public void test3(){
        SqlSession sqlSession = util.getSqlSession();
        EmplDao mapper = sqlSession.getMapper(EmplDao.class);
        List<Empl> getallempl = mapper.getallempl(102);
        System.out.println(getallempl);
    }
}
