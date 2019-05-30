package com.jayyin.consumer.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.*;



@SpringBootApplication
@ImportResource(value = {"classpath:consumer.xml"})
@RestController
public class ComsumerOrderApplication {


    public static void main(String[] args) {
        SpringApplication.run(ComsumerOrderApplication.class, args);
    }

}

