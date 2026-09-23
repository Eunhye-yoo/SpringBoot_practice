package com.example.ch1.mission;

/*
MemberForm 이라는 DTO, VO 작성
1. class로 생성한 경우
- 일반 필드, setter를 이용하여 필드값 변경 가능, 상속 가능
2. record로 생성한 경우
- 모든 필드가 상수로 선언, setter가 없음, 상속 불가능
 */
public record MemberForm(String name, String email, String password) {}

//import lombok.Data;
//
//@Data
//public class MemberForm {
//    private String name;
//    private String email;
//    private String password;
//}
