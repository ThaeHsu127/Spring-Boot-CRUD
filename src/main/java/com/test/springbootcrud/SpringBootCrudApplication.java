package com.test.springbootcrud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootCrudApplication{

    public static void main(String[] args) {

        SpringApplication.run(SpringBootCrudApplication.class, args);
    }

}
