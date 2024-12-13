package com.spring.core.chap02_3.practice.q1;

import com.spring.core.chap02_3.config.ModelConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ModelConfig.class);
        context.getBean(Person.class);
    }
}