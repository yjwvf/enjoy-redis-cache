package com.enjoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LockApp2 {
    public static void main(String[] args) {
        System.out.println("test init");
        System.out.println("v0.1 add");
        SpringApplication.run(LockApp2.class, args);
    }
}
