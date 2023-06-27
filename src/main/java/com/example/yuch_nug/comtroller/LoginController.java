package com.example.yuch_nug.comtroller;

import com.example.yuch_nug.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/SiginPage")

    public String SigInPage(HttpServletRequest request, String id, String pw){
        System.out.println("사용자가 입력한 정보는?");
        System.out.println(id + "/" + pw);
        loginService.loginSave(id, pw);

        String referer = request.getHeader("Referer"); // Referer 헤더 값을 얻습니다.

        if (referer != null) {
            return "redirect:/"; // 이전 페이지로 리다이렉트합니다.
        } else {
            return "redirect:/index.html"; // 이전 페이지 정보가 없으면 기본 페이지로 이동합니다.
        }
    }

    @PostMapping("/logins")
    public String loginPage(HttpServletRequest request, String id, String pw){
        System.out.println("사용자가 입력한 정보는?");
        System.out.println(id + "/" + pw);

        String referer = request.getHeader("Referer"); // Referer 헤더 값을 얻습니다.

        if (referer != null) {
            return "redirect:/"; // 이전 페이지로 리다이렉트합니다.
        } else {
            return "redirect:/index.html"; // 이전 페이지 정보가 없으면 기본 페이지로 이동합니다.
        }
    }

}
