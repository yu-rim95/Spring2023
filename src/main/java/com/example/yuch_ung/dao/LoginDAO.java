package com.example.yuch_ung.dao;

import com.example.yuch_ung.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
// mybatis-spring 2.0.7
// 3.0.2
@Repository
public class LoginDAO {

    @Autowired
    private LoginMapper loginMapper;

    public int loginSave(String id, String pw){
        return loginMapper.loginSave(id,pw);
    }
}
