package com.spring.core.chap02_2.quiz.quiz1;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;


@AllArgsConstructor
public class Library {

    private List<Book> books;


    public String toString() {
       return books.stream()
               .map(Book::toString)
               .collect(Collectors.joining(","));
    }

    public void listBooks() {
        books.forEach(System.out::println);
    }
}