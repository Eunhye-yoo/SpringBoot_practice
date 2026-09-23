package com.example.thymeleaf_practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    private Long no;                // 글 번호
    private boolean isNotice;       // 공지 여부 ([공지] 뱃지 출력용)
    private String title;           // 제목
    private String writer;          // 작성자
    private LocalDateTime regDate;  // 작성일시 (포맷팅 대상)
}
