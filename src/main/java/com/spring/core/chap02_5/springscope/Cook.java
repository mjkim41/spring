package com.spring.core.chap02_5.springscope;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// Scope : 기본은 singleton(하나의 객체를 계속 반환), prototype은 다 다른 객체를 반환
@Scope("prototype")
public class Cook {

    public Cook() {
    }
}
