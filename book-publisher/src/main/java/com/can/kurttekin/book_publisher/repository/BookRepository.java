package com.can.kurttekin.book_publisher.repository;

import com.can.kurttekin.book_publisher.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
