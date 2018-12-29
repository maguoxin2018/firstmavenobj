package com.neuedu.test;

import com.neuedu.dao.asDao;
import com.neuedu.dao.asDaoImp;
import com.neuedu.pojos.Boys;
import com.neuedu.util.util;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;



import java.util.List;

public class asdasda {
    @Test
    public void test1(){
        Boys boys = new Boys(88,"asdassda",100);
        asDao asDao =new asDaoImp();
        int i = asDao.insertAndReturnId(boys);
        System.out.println(i);

    }
}
