package com.can.kurttekin.book_publisher.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "cankurttekin.kafka")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KafkaConfigProps {
    private String topic;
}
