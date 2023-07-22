package com.example.ol.Application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ol")
public class BwlistApplication {
    public static void main(String[] args) {
        SpringApplication.run(BwlistApplication.class, args);
    }
}
