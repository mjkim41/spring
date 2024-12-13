package com.spring.core.chap02_2.vehicle;


public class Car {

    //의존 객체 설정
    private Engine engine;


    public Car() {
    }

    // setter를 통한 의존성 주입
    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public void startEngine() {
        engine.start();
        System.out.println("자동차가 달릴 준비가 완료되었습니다.");
    }
}
