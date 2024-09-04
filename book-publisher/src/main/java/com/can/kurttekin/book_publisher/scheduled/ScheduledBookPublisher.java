package com.can.kurttekin.book_publisher.scheduled;

/*
 * Publishes book at fixed interval
 *
 */

import com.can.kurttekin.book_publisher.repository.BookRepository;
import com.can.kurttekin.book_publisher.service.BookPublisherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ScheduledBookPublisher {
    private long counter;
    private final BookRepository bookRepository;
    private final BookPublisherService bookPublisherService;

    public ScheduledBookPublisher(BookRepository bookRepository, BookPublisherService bookPublisherService) {
        resetCounter();
        this.bookRepository = bookRepository;
        this.bookPublisherService = bookPublisherService;
    }

    @Scheduled(cron = "0/20 * * * * *")
    public void publishBook() {
        bookRepository.findById(counter).ifPresentOrElse(book ->
        {
            counter++;
            bookPublisherService.publishBook(book);
            log.info("Book '{}' [{}] published.", book.getTitle(), book.getIsbn());
        }, () -> resetCounter());
    }

    private void resetCounter() {
        this.counter = 0;
    }


}
