package com.spring.core.chap02_5.springscope;

import com.spring.core.SpringCore202412Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CookTest {

    @Autowired
    Cook p1;

    @Autowired
    Cook p2;

    @Test
    void test() {
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
    }

}