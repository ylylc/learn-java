package org.learn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LearnApplication {

    public final static void main(String [] args) {
        SpringApplication.run(LearnApplication.class, args);

    }
}
