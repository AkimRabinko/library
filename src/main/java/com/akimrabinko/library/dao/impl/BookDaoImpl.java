package com.akimrabinko.library.dao.impl;

import com.akimrabinko.library.dao.BookDao;
import com.akimrabinko.library.dto.BookDto;
import com.akimrabinko.library.entity.Book;
import com.akimrabinko.library.entity.Period;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.akimrabinko.library.jooqData.tables.Book.BOOK;
import static org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO;

@Repository
@RequiredArgsConstructor
public class BookDaoImpl implements BookDao {
    private final DSLContext dslContext;

    @Override
    public Book getBookByIsbn(String isbn) {
        return dslContext.select()
                .from(BOOK)
                .where(BOOK.ISBN.eq(isbn))
                .fetchOne()
                .into(Book.class);
    }

    @Override
    public List<Book> getBooksByAuthor(String author) {
        return dslContext.select()
                .from(BOOK)
                .where(BOOK.AUTHOR.eq(author))
                .fetchInto(Book.class);
    }

    @Override
    public List<Book> getBooksByPeriod(Period period) {
        return dslContext.select()
                .from(BOOK)
                .where(BOOK.YEAR_PUBLISHED.between(period.getPeriodStart().getYear(), period.getPeriodEnd().getYear()))
                .fetchInto(Book.class);
    }

    @Override
    public boolean addBook(BookDto bookDto) {
        return dslContext.insertInto(BOOK)
                .set(BOOK.ISBN, bookDto.getIsbn())
                .set(BOOK.AUTHOR, bookDto.getAuthor())
                .set(BOOK.NAME, bookDto.getName())
                .set(BOOK.LANGUAGE, bookDto.getLanguage())
                .set(BOOK.PAGES_COUNT, bookDto.getPagesCount())
                .set(BOOK.YEAR_PUBLISHED, bookDto.getYearPublished())
                .set(BOOK.PUBLISHING_HOUSE, bookDto.getPublishingHouse())
                .set(BOOK.SHORT_INFO, bookDto.getShortInfo())
                .execute() > INTEGER_ZERO;
    }
}
