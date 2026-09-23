package com.example.ch1;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// 원격 프로그램 등록
// WAS를 이용하여 원격 프로그램 등록 가능
@Controller
public class HomeController{
    // 모든 HTTP 메서드 처리
    @RequestMapping("/")
    public String main(){
        return "index";
    }

    @GetMapping("/test")
    public void test(Model model, HttpServletRequest request){
        model.addAttribute("lastName","BAEK");
        model.addAttribute("firstName","KIWAN");

        // 1. Request 영역(1회성)
        request.setAttribute("req","request");

        // 2. Session 영역(각 클라이언트의 고유한 저장 공간)
        HttpSession session = request.getSession();
        session.setAttribute("sess","session");

        // 3. Application or Context 영역(WAS가 종료될때 까지 유지)
        ServletContext applicationContext = request.getServletContext();
        applicationContext.setAttribute("ctx","context");

        // 각 영역 우선순위 비교
        model.addAttribute("msg","model");
        request.setAttribute("msg","request");
        session.setAttribute("msg","session");
        applicationContext.setAttribute("msg","context");

    }
}