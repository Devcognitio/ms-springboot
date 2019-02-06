package com.devco.sbexample;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

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