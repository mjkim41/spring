package com.spring.core.chap02_1.config;

import com.spring.core.chap02_1.service.GreetingService;
import com.spring.core.chap02_1.service.GreetingServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* 전반적 원리 : 객체 생성을 개발자가 직접 'new 객체'에서 생성/관리하지 않고, spring이 자동으로 해줬으면 좋겠어.
               어떻게 할 수 있니?
          => 1) 그럴려면 ApplicationContext이라는 객체 자동 생성/관리를 담당해주는 스프링 컨테이너에 이 클래스를 전달 후에 객체들을 생성해 주면 돼.
                어떻게?
          => 2) 클래스를 하나 만들어서 @Configuration을 해서 '이 클래스에서 bean(스프링 컨테이너에서 생성 관리하는 객체)를 만들거야'라고 선언하고
          => 3) @Bean을 단 메소드를 만들어서, 메소드에서 원하는 객체를 만들어줘
          => 4) 그렇게 하면, 스프링 컨테이너가 애플리케이션 시작 시 이 설정 클래스를 읽고, @Bean 메소드에서 반환된 객체를 빈으로 등록해.
          => 5) 그럼 이후에 main 파일에서
                 i. 설정 클래스를 읽어와서 스프링 컨테이너를 초기화하고 빈을 생성해.
                    이 떄 bean이 생성되는 원리는, 스프링 컨테이너가 초기화 되면서 @Bean으로 적은 method가 호출되는 거야.
                     ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
                 ii. context.getBean() 메소드를 사용해서 생성된 빈을 가져오고 필요한 값을 불러오면 돼
 */


// @ Configuration : Spring아, 이 class에서 니가 bean 자동으로 관리해줘야 할 bean(객체)들을 줄게.
//                   (나중에 app 실행 시 자동으로 @Configuration이 있는 클래스를 읽고 @bean에 있는 객체를 spring container로 전달해줌.)
@Configuration
public class AppConfig2 {

    // @Bean : spring아, 내가 여기에 니가 관리해줘야 할 객체들 메소드 안에다가 넣어 줄게.
    //         나중에 내가 AnnotationConfigApllicationContext 객체 만들면 그 때 니가 이 메소드 호출하면서 객체도 생성해줘
    @Bean
    GreetingServiceImpl methodForContainerCall() {
        return new GreetingServiceImpl("미돌");
    }

}
