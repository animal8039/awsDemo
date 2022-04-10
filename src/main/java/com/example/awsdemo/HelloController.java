package com.example.awsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/awsDemo")
    public String index() {
        return "Greetings from AWS!";
    }

}