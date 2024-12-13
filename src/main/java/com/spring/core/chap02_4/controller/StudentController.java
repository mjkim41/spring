package com.spring.core.chap02_4.controller;

import com.spring.core.chap02_4.model.Student;
import com.spring.core.chap02_4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StudentController {

    private StudentRepository studentRepository;

//    @Autowired
    // 생성자 주입을 사용할 때 생성자가 딱 한개만 존재하면 @Autowired 생략 가능
    // @Qualifier("memoryRepo") : StudentRepository 객체가 두 종류가 있는데, 그 중에서 @Component("memoryRepo")로 만든 객체를 전달해 주세요.
    public StudentController(@Qualifier("memoryRepo") StudentRepository studentRepository) {
        System.out.println("생성자 주입!");
        this.studentRepository = studentRepository;
    }

    public void printStudentInfo() {
        Student student = studentRepository.findByStudentId("ID");
        System.out.println("student = " + student);

    }
}
