package com.spring.core.chap02_2.quiz.quiz1;

import lombok.*;

import java.util.Objects;

// lombok
// ombok은 lombok.jar 안에 포함된 애너테이션 처리기를 통해 작동합니다.
// 이 처리기는 자바 컴파일러가 코드를 컴파일할 때 Lombok 애너테이션을 처리합니다.
// 애노테이션 처리기는 빌드 도구에 의해 자동으로 실행
// 17 이후로는 record로 클래스 생성하면 됨


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