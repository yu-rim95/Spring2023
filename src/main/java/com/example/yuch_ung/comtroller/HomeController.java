package com.example.yuch_ung.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/signin")
    public String signInPage(){
        System.out.println("테스트");
        return "signin";
    }

}
