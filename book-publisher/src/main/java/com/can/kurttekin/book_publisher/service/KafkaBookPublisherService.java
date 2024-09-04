package com.can.kurttekin.book_publisher.service;

import com.can.kurttekin.book_publisher.domain.Book;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * Publishes books to Kafka Topic.
 */
public class KafkaBookPublisherService implements BookPublisherService {
    private final ObjectMapper objectMapper;
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final KafkaConfigProps kafkaConfigProps;

    @Override
    public void publishBook(Book book) {

    }
}
