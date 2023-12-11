package com.example.bloc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BlocApplication {


        public static void main(String[] args) {
            SpringApplication.run(BlocApplication.class, args);
        }


}
