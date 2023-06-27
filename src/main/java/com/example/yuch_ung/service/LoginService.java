package com.example.yuch_ung.service;

import com.example.yuch_ung.dao.LoginDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

//    @Autowired
    private LoginDAO loginDAO;

    public int loginSave(String id, String pw) {
        return loginDAO.loginSave(id, pw);
    }
}
