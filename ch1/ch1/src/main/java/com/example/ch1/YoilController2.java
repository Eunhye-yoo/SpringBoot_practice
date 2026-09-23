package com.example.ch1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@Controller
public class YoilController2 {
    @GetMapping("/yoil")
    public String yoil() {
        // redirect:를 붙여야 static 폴더에서 해당 파일을 찾는다.
        return "redirect:/yoil.html";
    }

    @RequestMapping("/getYoil2")
    public String main(int year, int month, int day, Model model){
        // 2. 작업 : 요일 계산(Process)
        LocalDate date = LocalDate.of(year, month, day);
        // 요일 구하기
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // 영어 요일
        String yoil = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);

        // 화면 반환
        model.addAttribute("year", year);
        model.addAttribute("month", month);
        model.addAttribute("day", day);
        model.addAttribute("yoil", yoil);
        return "yoil2";
    }
}
