package com.akimrabinko.library.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import java.util.List;

@Value
public class BookDto {
    String isbn;
    List<String> authors;
    String name;
    String language;
    int pagesCount;
    int yearPublished;
    String publishingHouse;
    String shortInfo;

    @JsonCreator
    public BookDto(@JsonProperty("isbn") String isbn,
                   @JsonProperty("authors") List<String> authors,
                   @JsonProperty("name") String name,
                   @JsonProperty("language") String language,
                   @JsonProperty("pagesCount") int pagesCount,
                   @JsonProperty("yearPublished") int yearPublished,
                   @JsonProperty("publishingHouse") String publishingHouse,
                   @JsonProperty("shortInfo") String shortInfo) {
        this.isbn = isbn;
        this.authors = authors;
        this.name = name;
        this.language = language;
        this.pagesCount = pagesCount;
        this.yearPublished = yearPublished;
        this.publishingHouse = publishingHouse;
        this.shortInfo = shortInfo;
    }
}
