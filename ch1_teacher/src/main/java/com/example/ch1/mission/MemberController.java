package com.example.ch1.mission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @GetMapping("/members/join")
    public String joinForm() {
        return "mission/join";
    }

    @PostMapping("/members/join")
    public String join(@ModelAttribute MemberForm mem, Model model) {
        model.addAttribute("member", mem);
        return "mission/joinResult";
    }
}
