package com.example.ch1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
public class MemberController {
    @GetMapping("/join")
    public void memberJoin(){
        // 회원 가입 페이지로 이동
    }
}
