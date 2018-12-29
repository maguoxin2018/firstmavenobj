package com.neuedu.dao;

import com.neuedu.pojos.Boys;

import java.util.List;

public interface asDao {
    public List<Boys> all();
    int insertAndReturnId(Boys boys);
    List<Boys> moreselect(Boys boys);
    List<Boys> more(Boys boys);
}
