package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(
            topics = "msk",
            groupId = "demo"
    )
    public void listen(String msg) throws IOException {
        log.info("Consumed message : {}", msg);
    }
}
