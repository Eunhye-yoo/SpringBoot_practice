package com.example.ch1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/*
 * 년,월,일 입력시 요일을 알려주는 원격 프로그램
 */

@RestController
public class YoilController {

//    @RequestMapping("/getYoil")
//    public String main(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        // 1. 클라이언트의 요청으로 전달된 값 저장
//        String year = request.getParameter("year");
//
//        int yyyy = Integer.parseInt(year);
//        // 2. 작업 : 요일 계산(Process)
//
//        // 3. 응답
//        response.setContentType("text/html;charset=utf-8");
//        PrintWriter out = response.getWriter();
//    }

    @RequestMapping("/getYoil")
    public String main(HttpServletRequest request){
        // 1. 클라이언트의 요청으로 전달된 값 저장
        int year = Integer.parseInt(request.getParameter("year"));
        int month = Integer.parseInt(request.getParameter("month"));
        int day = Integer.parseInt(request.getParameter("day"));

        // 2. 작업 : 요일 계산(Process)
        LocalDate date = LocalDate.of(year, month, day);
        // 요일 구하기
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        // 영어 요일
        String yoil = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);

        // 3. 응답
        return yoil;
    }
}
