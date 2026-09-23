package com.example.ch1.aop;

import java.lang.reflect.Method;
import java.util.regex.Pattern;

// 실제로 프로젝트에 필요한 핵심 기능(비즈니스 로직) 구현 클래스
class MyClass{
    void aaa(){
        System.out.println("aaa");
    }
    void aaa2(){
        System.out.println("aaa2");
    }
    void bbb(){
        System.out.println("bbb");
    }
}

// 프로젝트에 필요한 공통 기능 구현 클래스
class MyAdvice{
    // 1. 공통 코드를 추가할 메서드 규칙(패턴) 설정
    // 정규표현식으로 a로 시작하는 모든 문자열 패턴 생성
    Pattern p = Pattern.compile("^a.*");

    // 2. invoke()로 전달된 메서드의 이름이 패턴과 일치하는지 판별
    boolean matches(Method m){
        return p.matcher(m.getName()).matches();
    }

    void invoke(Method m, Object obj, Object... args) throws Exception{
        if(matches(m)){
            System.out.println("[before]");
        }
        // 실제 메서드 실행
        m.invoke(obj, args);
        if(matches(m)){
            System.out.println("[after]");
        }
    }
}

public class AopMain {
    public static void main(String[] args) throws Exception {
        // 1. 클래스 정보를 문자열로 불러와서 객체 생성
        Class myClass = Class.forName("com.example.ch1.aop.MyClass");
        Object myObject = myClass.newInstance(); // 위에서 찾아낸 클래스로 객체 생성

        MyAdvice myAdvice = new MyAdvice();

        // MyClass 안에 선언된 모든 메서드를 하나씩 실행
        // myClass.getDeclaredMethods() -> {aaa(),aaa2(),bbb()}
        for(Method method :myClass.getDeclaredMethods()){
            // invoke() : 실제 메서드 호출
            // 이때, Advice 추가 여부 결정
            myAdvice.invoke(method, myObject);
        }
    }
}
