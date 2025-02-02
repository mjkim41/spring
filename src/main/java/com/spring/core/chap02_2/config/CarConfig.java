package com.spring.core.chap02_2.config;

import com.spring.core.chap02_2.vehicle.Car;
import com.spring.core.chap02_2.vehicle.Engine;
import org.springframework.context.annotation.Bean;

public class CarConfig {

    // 스프링아, 엔진 니가 만들어라
    @Bean
    public Engine engine() {
        return new Engine();
    }

    // 스프링아, 자동차도 나 대신 만들어서 관리해주는데 (IoC)
    // 자동차 만들 떄 엔진도 낑겨서 만들어줘라 (DI)
    @Bean
    public Car car() {
//        Car car = new Car(engine()); // 생성자 주입
        Car car = new Car();
        car.setEngine(engine()); // setter 주입
        return car;
    }

}
