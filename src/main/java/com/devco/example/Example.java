package com.devco.example;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class Example extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Example.class);
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String home() {
        return "Hello World!";
    }

    @RequestMapping(value="/helloName", method = RequestMethod.GET)
    public String helloName(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}