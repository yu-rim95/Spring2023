package com.example.yuch_ung;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/test")
    public String Hello(){
        System.out.println("테스트");
        return "tests";
    }
}
