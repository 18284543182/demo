package com.example.demo.model;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("${book.name}")
    private  String name;

    @Value("${book.author}")
    private  String author;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book() {
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}
