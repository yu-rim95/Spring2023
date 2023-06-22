package com.example.yuch_ung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/SiginPage")
    public String SignInPage(String id, String pw) {
        System.out.println("사용자가 입력한 정보는? ");
        System.out.println(id + "/" + pw) ;
        return "redirect:/index.html";
    }
}
