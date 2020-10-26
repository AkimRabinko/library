package com.akimrabinko.library.service.impl;

import com.akimrabinko.library.dao.BookDao;
import com.akimrabinko.library.dto.BookDto;
import com.akimrabinko.library.entity.Book;
import com.akimrabinko.library.entity.Period;
import com.akimrabinko.library.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookDao bookDao;

    @Override
    public Book getBookByIsbn(String isbn) {
        return bookDao.getBookByIsbn(isbn);
    }

    @Override
    public List<Book> getBooksByAuthor(String author) {
        return bookDao.getBooksByAuthor(author);
    }

    @Override
    public List<Book> getBooksByPeriod(Period period) {
        return bookDao.getBooksByPeriod(period);
    }

    @Override
    public boolean addBook(BookDto bookDto) {
        return bookDao.addBook(bookDto);
    }
}
