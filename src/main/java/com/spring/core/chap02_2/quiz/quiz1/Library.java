package com.spring.core.chap02_2.quiz.quiz1;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
public class Library {

    private List<Book> books;

//    public Library(List<Book> books) {
//        this.books = books;
//    }

    public void listBooks() {
        books.forEach(System.out::println);
    }
}