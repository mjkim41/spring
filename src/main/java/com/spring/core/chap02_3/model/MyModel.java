package com.spring.core.chap02_3.model;

// DB로부터 가져온 데이터라고 가정

import lombok.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Setter  @Getter
@ToString
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode

@Component
public class MyModel {

    private String data;


}
