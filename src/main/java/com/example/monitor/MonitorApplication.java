package com.example.monitor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@Slf4j
@RestController
@SpringBootApplication
public class MonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorApplication.class, args);
    }

    @GetMapping
    public Instant index() {
        var now = Instant.now();
        LOGGER.info("Received {}", now);
        return now;
    }
}
