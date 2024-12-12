package com.spring.core.chap01;

public class WesternRestaurant implements Restaurant {

    private Chef chef = new JanChef();
    private Course course = new FrenchCourse();

    public void order() {
        System.out.println("서양 요리 주문");
        course.combineMenu();
        chef.cook();
    }
}
