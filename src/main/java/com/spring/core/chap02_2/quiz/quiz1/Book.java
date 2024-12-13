package com.spring.core.chap02_2.quiz.quiz1;

import lombok.*;

import java.util.Objects;

// [lombok]
//  - annotation tag로 @Getter, @Setter 등의 boilerplate 코드를 쉽게 작성할 수 있게 해주는 라이브러리
//  - 작동 원리 :
//     1) Build 도구 dependencies에 lombok 라이브러리 추가
//     2) 위의 설정에 의해, 자바 컴파일러가 실행될 때 lombok의 annotation 처리기가 실행됨
//     3) -> lombook Aannotation(@) 처리기에 의해 getter 자동 생성됨
//   - FYI. Java SE ver. 16 이후로는 record로 클래스 생성하면 됨


//@Data
@Setter
@Getter
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 필드 초기화 생성자
@ToString
@EqualsAndHashCode


public class Book {
    private String title;
    private String author;

// 기본생성자
    // 모든필드 초기화 생성자
    // setter getter
    // toString, equals, hashcode
}