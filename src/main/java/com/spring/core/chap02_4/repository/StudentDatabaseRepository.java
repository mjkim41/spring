package com.spring.core.chap02_4.repository;

import com.spring.core.chap02_4.model.Student;
import org.springframework.stereotype.Component;

@Component("dbRepo")
public class StudentDatabaseRepository implements StudentRepository {


    @Override
    public Student findByStudentId(String studentId) {
        System.out.println("DB에서 학생을 조회합니다.");
        return new Student("001", "미돌", "S+");
    }
}
