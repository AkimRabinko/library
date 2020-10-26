package com.akimrabinko.library.controller;

import com.akimrabinko.library.dto.BookDto;
import com.akimrabinko.library.entity.Book;
import com.akimrabinko.library.entity.Period;
import com.akimrabinko.library.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("books")
public class BookController {
    private final BookService bookService;

    @GetMapping("{isbn}")
    public Book getBookByIsbn(@PathVariable String isbn) {
        return bookService.getBookByIsbn(isbn);
    }

    @GetMapping("{author}")
    public List<Book> getBooksByAuthor(@PathVariable String author) {
        return bookService.getBooksByAuthor(author);
    }

    @GetMapping("period")
    public List<Book> getBooksByPeriod(Period period) {
        return bookService.getBooksByPeriod(period);
    }

    @PostMapping("add")
    public boolean addBook(@RequestBody BookDto bookDto) {
        return bookService.addBook(bookDto);
    }
 }
