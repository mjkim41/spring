package com.spring.core.chap02_1.service;

import com.spring.core.chap02_1.config.AppConfig2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceImplTest2 {

    /* @Test :
        - JUnit(자바 애플리케이션에서 단위 테스트를 작성하고 실행하는 데 널리 사용되는 테스트 프레임워크)의 애노테이션으로,
        - 작동원리 :
          1) JUnit 프레임 워크를 Spring의 dependency에 추가한다.
          2) 코드 짤 때 @Test라는 Junit의 annotation를 붙이고
          3) 그 바로 밑에 아무 이름으로나 method를 작성하고
          4) 개발자가 play 버튼을 누르면 JUnit이 실행되면서 해당 메서드가 자동으로 호출된다.
    */


    @Test
    public void randomTest() {
        //내가 다른 클래스 파일에서 @configuration @bean 사용해서 bean을 등록해놨거든?
        // AnnotationConfigApplicationContenxt야, 그 클래스 불러오고 자동으로 @bean 붙은 메소드 생성해서 객체도 생성해줘.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
        // 그럼 생성된 객체 중에서, 00 객체를 가져와줘.
        GreetingServiceImpl midol = context.getBean(GreetingServiceImpl.class);
        // 그럼 내가 생성된 객체로 뭔가를 테스트 해볼게
        midol.getGreet();


    }
}