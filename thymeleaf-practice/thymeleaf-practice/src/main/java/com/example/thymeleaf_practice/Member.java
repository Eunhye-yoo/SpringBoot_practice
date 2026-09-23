package com.example.thymeleaf_practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    private String name;
    private String email;
    private String password;
}
