package com.example.springautoconfigsample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class SpringAutoconfigSampleApplication {

    @Autowired(required=false)
    private ExampleService exampleService;

    @PostConstruct
    public void postConstruct() {
        if (exampleService!=null) {
            System.out.println("example service result: "
                    + exampleService.wrap("word"));
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAutoconfigSampleApplication.class, args);
    }

}
