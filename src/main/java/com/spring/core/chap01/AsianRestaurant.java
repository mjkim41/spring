package com.spring.core.chap01;

public class AsianRestaurant implements Restaurant {

    // 전문 쉐프
    private KimuraChef chef = new KimuraChef();
    // 코스 메뉴
    private SushiCourse course = new SushiCourse();

    public void order () {
        System.out.println("아시안 요시를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
