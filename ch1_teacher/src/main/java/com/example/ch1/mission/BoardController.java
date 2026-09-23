package com.example.ch1.mission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BoardController {

    @GetMapping("/board")
    public String board(Model model) {
        List<Board>  boards = List.of(
                new Board(1, "공지: 사이트 점검", "관리자",
                        LocalDateTime.of(2026,9,17,8,7), true),
                new Board(2, "첫번째 글", "홍길동",
                        LocalDateTime.of(2026,9,18,8,7), false),
                new Board(3, "두번째 글", "김철수",
                        LocalDateTime.of(2026,9,18,10,7), false)
        );
        model.addAttribute("boards", boards);
        return "/mission/board";
    }
}
