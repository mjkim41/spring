package com.spring.core.chap02_1.service;

import ch.qos.logback.core.encoder.JsonEscapeUtil;

public class GreetingServiceImpl implements GreetingService {

    private final String name;

    public GreetingServiceImpl(String name) {
        this.name = name;
    }

    @Override
    public String greet() {
//        return String.format("안녕하세요, %s님", name);
        return "안녕하세요, %s님".formatted(this.name);
    }

    @Override
    public void getGreet() {
        System.out.println(greet());
    };


}
