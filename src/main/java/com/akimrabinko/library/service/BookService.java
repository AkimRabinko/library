package com.akimrabinko.library.service;

import com.akimrabinko.library.dto.BookDto;
import com.akimrabinko.library.entity.Book;
import com.akimrabinko.library.entity.Period;

import java.util.List;

public interface BookService {
    Book getBookByIsbn(String isbn);

    List<Book> getBooksByAuthor(String author);

    List<Book> getBooksByPeriod(Period period);

    boolean addBook(BookDto bookDto);
}
