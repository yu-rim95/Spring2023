package com.example.yuch_ung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("signIn")
    public String SigIn(){
        System.out.println("회원가입 페이지 진입");
        return "signin";
    }
}
