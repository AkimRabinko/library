package com.akimrabinko.library.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import java.util.List;

@Value
public class BookDto {
    String isbn;
    String author;
    String name;
    String language;
    int pagesCount;
    int yearPublished;
    String publishingHouse;
    String shortInfo;

    @JsonCreator
    public BookDto(@JsonProperty("isbn") String isbn,
                   @JsonProperty("author") String author,
                   @JsonProperty("name") String name,
                   @JsonProperty("language") String language,
                   @JsonProperty("pages_count") int pagesCount,
                   @JsonProperty("year_published") int yearPublished,
                   @JsonProperty("publishing_house") String publishingHouse,
                   @JsonProperty("short_info") String shortInfo) {
        this.isbn = isbn;
        this.author = author;
        this.name = name;
        this.language = language;
        this.pagesCount = pagesCount;
        this.yearPublished = yearPublished;
        this.publishingHouse = publishingHouse;
        this.shortInfo = shortInfo;
    }
}
