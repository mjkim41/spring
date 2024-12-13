package com.spring.core.chap02_3.repository;

// DB에 접근하여 데이터를 조회,수정,삭제,생성하는 역할을 하는 클래스

import com.spring.core.chap02_3.model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component : 스프링이 관리할 빈으로 자동 등록하겠다.
@Component
public class MyRepository {

    // 조회 기능
    @Autowired
    public MyModel findData() {
        return new MyModel("DB에서 가져온 데이터입니다.");
    }
}
