package com.demo_app.com.demo_app.controlle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldContorller {

    @GetMapping("/message")
    public String getMessage(){
        return "Hello Wordld";
    }
}
