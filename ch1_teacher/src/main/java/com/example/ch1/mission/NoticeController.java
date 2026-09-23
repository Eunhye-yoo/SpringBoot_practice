package com.example.ch1.mission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NoticeController {
    @GetMapping("/notices")
    public String notices(Model model) {
        // DB에서 공지사항을 모두 가져와야함.
        List<String> notices = List.of(
                "서버 점검 안내",
                "신규 회원 이벤트",
                "보안 패치 업데이트"
        );
        model.addAttribute("notices", notices);
        return "mission/notices";

    }
}
