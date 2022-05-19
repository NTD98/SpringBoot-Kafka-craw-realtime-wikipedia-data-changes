package com.example.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class WikimediaChangeProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(WikimediaChangeProducer.class);
    @KafkaListener(topics = "wikimedia_recent_change", groupId = "myGroup")
    private void consume(String data){
        LOGGER.info("Message received "+ data);
    }
}
