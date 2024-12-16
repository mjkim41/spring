package com.spring.core.chap04_2.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// AOP : 여러 메소드 혹은 여러 클래스에서 반복적으로 발생하는 코드에 작업에 대해 핵심 비즈니스 로직과 분리하여 클래스 생성하는 원칙
// 사용법 :
//  0. Aspect 라이브러리 depency 주입
//  1. 클래스에 @Component, @Aspect 부여
@Component
@Aspect
public class LoggingAndSecurityAspect {

    // 예시) UserService의 모든 메서드에 대해, 실행 전과 후에 공통으로 어떤 작업을 하고 싶을 때
    // 2. @Around 사용
    //   - execution : 실행 할 때
    //   - execution 괄호 안 : 적용할 클래스 및 매개변수, 생성자 설정
    //     (uUserService 클래스으. 모든 메서드(*)와 모든 생성자(..)에 대해 설정하겠다)
    @Around("execution(* com.spring.core.chap04_2.service.UserService.*(..))")
    public void logAspect(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("UserService의 메서드 실행!!");

        joinPoint.proceed(); // 3. 이 시점에서 핵심 로직 메서드가 호출

        System.out.println("UserService의 메서드 실행종료!!");
    }



    // 관리자 기능 실행 전에 관리자인지를 확인
    @Before("execution(* com.spring.core.chap04_2.service.UserService.performAdminTask(..))")
    public void checkUserAuth() {
        String currentUser = "common"; // db에서 권한조회 코드
        if (!currentUser.equals("admin")) {
            throw new SecurityException("접근 거부: 관리자 권한이 필요합니다.");
        }
    }
}
