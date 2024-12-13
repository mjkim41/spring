package com.spring.core.chap02_4.repository;

import com.spring.core.chap02_4.model.Student;
import org.springframework.stereotype.Component;

@Component("memoryRepo")
public class StudentMemoryRepository implements StudentRepository {


    @Override
    public Student findByStudentId(String studentId) {
        System.out.println("memory에서 학생 조회");
        return new Student("002", "미순", "A");
    }
}
