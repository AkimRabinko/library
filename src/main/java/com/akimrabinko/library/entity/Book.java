package com.akimrabinko.library.entity;

import lombok.Value;

import java.util.List;

@Value
public class Book {
    long id;
    String isbn;
    String author;
    String name;
    String language;
    int pagesCount;
    int yearPublished;
    String publishingHouse;
    String shortInfo;
}
