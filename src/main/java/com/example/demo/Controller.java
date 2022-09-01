package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class Controller {

    private final KafkaProducer kafkaProducer;

    @PostMapping("/kafka")
    public String sendMsg(@RequestParam("message")String message) {
        kafkaProducer.sendMessage(message);
        return "Success";
    }
}
