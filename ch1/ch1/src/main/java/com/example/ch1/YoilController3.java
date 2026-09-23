package com.example.ch1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@Controller
public class YoilController3 {
    @RequestMapping("/getYoil3")
    public String main(MyDate myDate, Model model){
        getYoil(myDate);
        // String yoil = getYoil(myDate);
        // model.addAttribute("yoil", yoil);
        return "yoil3";
    }

    // 작업 : 요일 계산(Process)
    @ModelAttribute("yoil") // 메서드의 반환 값이 yoil이라는 name으로 Model에 저장
    private static String getYoil(MyDate myDate){
        LocalDate date = LocalDate.of(myDate.getYear(), myDate.getMonth(), myDate.getDay());
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String yoil = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);
        return yoil;
    }
}
