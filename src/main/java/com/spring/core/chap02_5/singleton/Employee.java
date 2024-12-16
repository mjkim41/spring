package com.spring.core.chap02_5.singleton;

import lombok.AllArgsConstructor;


public class Employee {

    private Long id;
    private String name;

    /*
     싱글톤 패턴 : 특정 클래스에 대해 객체를 하나만 만드는 디자인 패턴
       1. 외부에서 객체의 생성을 제한
         - 생성자를 전부 없애서 객체 생성을 제한한다.
       2. 단 하나의 객체를 스스로 생성함
       3. 외부에서 객체 생성을 요구할 경우, 미리 만들어둔 단 하나의 객체를 제공
     */

    // 1.
    private Employee() {};

    // 2.
    private static Employee employee = new Employee();

    // 3.
    public static Employee getInstance() {
        return employee;
    }



}
