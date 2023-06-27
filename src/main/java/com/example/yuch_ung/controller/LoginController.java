package com.example.yuch_ung.controller;

import com.example.yuch_ung.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

//    @Autowired
    private LoginService loginService;

    @GetMapping("/SiginPage")
    @ResponseBody
    public String SignInPage(String id, String pw) {
        System.out.println("사용자가 입력한 정보는? ");
        System.out.println(id + "/" + pw) ;
        loginService.loginSave(id,pw);
        return "redirect:/index.html";
    }
}
