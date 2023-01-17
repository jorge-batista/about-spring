package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;


@SpringBootApplication
public class AboutSpringApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(AboutSpringApplication.class);
        springApplication.addListeners(new ApplicationPidFileWriter());
        springApplication.run(args);
    }

}
