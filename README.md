# Spring Boot Practice

Java와 Spring Boot를 학습하며 수업 코드, 개인 미션, 개념 검증용 실습을 정리하는 저장소입니다.

완성된 서비스 프로젝트보다는 **Spring MVC의 요청 흐름을 이해하고, 직접 코드를 작성·비교·테스트하며 개념을 익히는 과정**을 기록하는 데 목적이 있습니다.

## Tech Stack

![Java](https://img.shields.io/badge/Java-21-007396?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.1-6DB33F?logo=springboot&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.x-005F0F?logo=thymeleaf&logoColor=white)
![JPA](https://img.shields.io/badge/JPA-Hibernate-59666C)
![QueryDSL](https://img.shields.io/badge/QueryDSL-5.0.0-0769AD)
![MySQL](https://img.shields.io/badge/MySQL-8.x-4479A1?logo=mysql&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-Build-02303A?logo=gradle&logoColor=white)

## Learning Focus

- Spring MVC 요청 처리 흐름
- Controller와 URL Mapping
- Request Parameter / Model Binding
- Thymeleaf 화면 렌더링 및 Fragment/Layout 구성
- Interceptor를 이용한 요청 전처리와 접근 제어
- AOP의 기본 구조와 적용 흐름
- Spring Data JPA 기반 Entity / Repository 사용
- JPA 연관관계와 영속성 컨텍스트
- Lazy Loading 동작 확인
- QueryDSL을 이용한 조건 조회, 집계, 정렬, 동적 검색
- JUnit 기반 동작 검증

## Repository Structure

| Folder | 학습 내용 | 성격 |
| --- | --- | --- |
| `ch1` | Spring MVC, 요청 파라미터 처리, Controller, Thymeleaf, Layout/Fragment | 기본 수업 및 실습 |
| `ch1_mission` | 로그인 여부에 따른 접근 제어, Interceptor 설정 | 개인 미션 풀이 |
| `ch1_teacher` | MVC, Interceptor, AOP, 회원/게시판/공지 예제 | 수업·비교용 코드 |
| `thymeleaf-practice` | 회원가입 Form Binding, 게시판 목록, 공통 공지 Fragment | Thymeleaf 복습 실습 |
| `ch2` | Spring Data JPA, Entity 관계, Persistence Context, QueryDSL | DB/JPA 심화 실습 |

> 각 폴더는 학습 시점에 생성한 독립적인 Spring Boot 프로젝트이며, 일부 미션 코드는 학습 진행 과정이 그대로 남아 있습니다.

## What I Practiced

### 1. Spring MVC

Controller에서 요청을 받고 데이터를 가공한 뒤 View에 전달되는 흐름을 실습했습니다.

- `@Controller`
- `@GetMapping`, `@PostMapping`
- Request Parameter 처리
- 객체 단위 Model Binding
- `Model`을 통한 View 데이터 전달
- 정적 리소스와 Template 경로 구분

### 2. Thymeleaf

서버에서 전달한 데이터를 HTML 화면에 렌더링하고 반복되는 화면 요소를 분리하는 연습을 진행했습니다.

- 회원가입 Form 처리
- 게시판 목록 출력
- Fragment를 이용한 공통 영역 구성
- Layout 구조 실습

### 3. Interceptor / AOP

요청이 Controller에 도달하기 전 처리 흐름과 공통 로직 분리 방식을 학습했습니다.

- `HandlerInterceptor`
- `WebMvcConfigurer`
- URL별 Interceptor 적용 / 제외
- AOP의 공통 관심사 분리 개념

### 4. JPA

Entity와 Repository를 직접 작성하고 테스트를 통해 객체 관계와 DB 동작을 확인했습니다.

- Spring Data JPA Repository
- `@ManyToOne`, `@OneToMany`, `@OneToOne`
- 영속성 컨텍스트
- `flush()`, `clear()`
- Lazy Loading
- Transaction 범위에 따른 Entity 조회 동작

### 5. QueryDSL

문자열 기반 쿼리가 아닌 Java 코드 기반으로 조회 조건을 조합하는 방식을 연습했습니다.

- 조건 조회
- Projection
- Group By / Having
- Order By
- Join
- BooleanBuilder를 이용한 동적 조건 구성

## Learning Approach

단순히 예제를 따라 작성하는 데 그치지 않고 아래 순서로 학습하고 있습니다.

**개념 이해 → 수업 코드 작성 → 개인 미션 풀이 → 결과 비교 → 테스트로 동작 확인 → 다시 설명하기**

특히 Spring 내부 흐름을 외우기보다, 요청이 어떤 객체와 설정을 거쳐 처리되는지 직접 코드에서 추적하는 것을 목표로 합니다.

## Related Repository

- [study_log](https://github.com/Eunhye-yoo/study_log) — Java, Python, Network 등 기초 개념 학습 기록
- [EduPOP](https://github.com/Eunhye-yoo/EduPOP) — 학원 관리 서비스 팀 프로젝트

---

This repository is continuously updated as I study Spring Boot and backend development.
