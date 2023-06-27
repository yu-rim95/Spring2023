package com.example.yuch_nug.dao;

import com.example.yuch_nug.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAO {

    @Autowired
    private LoginMapper loginMapper;

    public int loginSave(String id, String pw){
        return loginMapper.loginSave(id, pw);
    }
}
