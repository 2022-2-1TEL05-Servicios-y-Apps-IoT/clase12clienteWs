package com.example.clase12clientews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class Clase12clienteWsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Clase12clienteWsApplication.class, args);
    }

}
