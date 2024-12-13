package com.spring.core.chap02_4.model;

import lombok.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString @EqualsAndHashCode

@Component
public class Student {

    private String studentId;
    private String name;
    private String grade;

}
