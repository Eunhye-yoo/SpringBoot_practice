package com.example.ch1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/members")
public class OldMemberController {
    @GetMapping("/join")
    public void memberJoin(){
        //회원 가입 페이지로 이동

    }
}
