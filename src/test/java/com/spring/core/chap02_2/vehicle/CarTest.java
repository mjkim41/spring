package com.spring.core.chap02_2.vehicle;

import com.spring.core.chap02_2.config.CarConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void test() {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(CarConfig.class);

        Car bean = context.getBean(Car.class);
        bean.startEngine();
    }

}