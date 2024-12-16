package com.spring.core.chap03_3.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev") // 개발환경에서 active 됨
public class DecMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "이것은 개발환경에서 사용하는 서비스입니다.";
    }
}
