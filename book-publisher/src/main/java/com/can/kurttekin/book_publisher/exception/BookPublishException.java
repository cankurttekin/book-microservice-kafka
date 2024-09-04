package com.can.kurttekin.book_publisher.exception;

import com.can.kurttekin.book_publisher.domain.Book;
import lombok.Getter;

public class BookPublishException extends RuntimeException {
    @Getter
    private Book book;

    public BookPublishException(Book book) {
        this.book = book;
    }

    public BookPublishException(final Book book, String message) {
        super(message);
        this.book = book;
    }

    public BookPublishException(final Book book, String message, Throwable cause) {
        super(message, cause);
        this.book = book;
    }

    public BookPublishException(final Book book, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String message) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.book = book;
    }
}
