package com.dounine.shorten;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by lake on 17-2-28.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.dounine.shorten"})
@EnableAutoConfiguration(exclude = {ValidationAutoConfiguration.class})
public class Application {

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        SpringApplication.run(Application.class, args);
        System.in.read();
    }
}
