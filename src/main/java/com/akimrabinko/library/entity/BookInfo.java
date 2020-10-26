package com.akimrabinko.library.entity;

import lombok.Value;

import java.util.List;

@Value
public class BookInfo {
    long id;
    String isbn;
    List<String> author;
    String name;
    String language;
    int pagesCount;
    int yearPublished;
    String publishingHouse;
    String shortInfo;
}
