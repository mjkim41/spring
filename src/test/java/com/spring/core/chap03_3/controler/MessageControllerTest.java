package com.spring.core.chap03_3.controler;

import com.spring.core.chap02_3.config.ModelConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

// test할 때 ApplicationContext 객체 생성 및 getBean() 없이 하려면,
// 1. 클래스에 @SpringBootTest 단다.
// 2. new ApplicationContext 이랑 getBean 대신
//    @Autowired
//    MessageController controller
//    위와 같이 의존성을 주입해준다.

@SpringBootTest
class MessageControllerTest {

    @Autowired
    MessageController controller;

    @Test
    void test() {
        controller.showMessage();
    }

}