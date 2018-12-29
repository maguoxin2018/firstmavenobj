package com.neuedu.dao;

import com.neuedu.pojos.Boys;
import com.neuedu.util.util;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class asDaoImp implements asDao {
//    chaxun
    @Override
    public List<Boys> all() {
        SqlSession asd = util.getSqlSession();
        List<Boys> aa = asd.selectList("selectall",null);
        return aa;
    }

    @Override
    public int insertAndReturnId(Boys boys) {
        SqlSession sqlSession = util.getSqlSession();
        int insertAndReturnId = sqlSession.insert("insertAndReturnId", boys);
        return insertAndReturnId;
    }

    @Override
    public List<Boys> moreselect(Boys boys) {
        SqlSession sqlSession = util.getSqlSession();
        List<Boys> objects = sqlSession.selectList("moreselect",boys);
        return objects;
    }

    @Override
    public List<Boys> more(Boys boys) {
        return null;
    }

    public List<Boys> qwe(String string){
        SqlSession sqlSession = util.getSqlSession();
        List<Boys> asdasd = sqlSession.selectList("asdasd",string);
        return asdasd;
    }

}
