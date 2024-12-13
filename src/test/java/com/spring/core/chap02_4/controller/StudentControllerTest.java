package com.spring.core.chap02_4.controller;

import com.spring.core.config.StudentConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    @Test
    void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        StudentController bean = context.getBean(StudentController.class);
        bean.printStudentInfo();

    }

}