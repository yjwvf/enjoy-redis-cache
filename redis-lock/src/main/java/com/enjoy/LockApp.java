package com.enjoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LockApp {
    public static void main(String[] args) {
        System.out.println("test init");
        SpringApplication.run(LockApp.class, args);
    }
}
