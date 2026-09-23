package com.example.thymeleaf_practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class PracticeController {
    // 모든 화면에서 공통으로 띄울 공지사항 데이터 공급 메서드
    private void addNoticeList(Model model) {
        List<String> notices = Arrays.asList(
                "📢 서버 점검 안내: 8월 30일 오전 2시 ~ 4시",
                "🎉 신규 회원 이벤트 진행중",
                "⚡ 보안 패치 업데이트 완료"
        );
        model.addAttribute("notices", notices);
    }

    // 1. 메인 안내 화면
    @GetMapping("/practice")
    public String mainPage(Model model) {
        addNoticeList(model);
        return "practice-main";
    }

    // 2. 회원가입 폼 화면 열기 (GET)
    @GetMapping("/members/join")
    public String joinForm(Model model) {
        addNoticeList(model);
        return "members/join";
    }

    // 3. 회원가입 처리 및 가입완료 화면 열기 (POST)
    @PostMapping("/members/join")
    public String joinSubmit(@ModelAttribute Member member, Model model) {
        addNoticeList(model);
        // 사용자가 입력한 정보를 완료 화면으로 전달
        model.addAttribute("joinedMember", member);
        return "members/join-success";
    }

    // 4. 게시판 목록 화면 열기 (GET)
    @GetMapping("/boards/list")
    public String boardList(Model model) {
        addNoticeList(model);

        // 교안 이미지의 게시판 더미 데이터 3건 생성
        List<Board> boardList = new ArrayList<>();
        boardList.add(new Board(1L, true, "공지: 사이트 점검 안내", "관리자", LocalDateTime.of(2025, 8, 27, 8, 7)));
        boardList.add(new Board(2L, false, "첫 번째 자유 글", "홍길동", LocalDateTime.of(2025, 8, 28, 3, 7)));
        boardList.add(new Board(3L, false, "두 번째 자유 글", "김철수", LocalDateTime.of(2025, 8, 28, 7, 37)));

        model.addAttribute("boardList", boardList);
        return "boards/list";
    }
}