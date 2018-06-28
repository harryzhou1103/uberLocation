package com.spring.uber.controller;


import com.spring.uber.domain.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @RequestMapping("/")
    public String welcome() {
        return "Hello Spring Uber!";
    }

    @RequestMapping("/hello/{yourName}")
    public Message showMessage(@PathVariable String yourName) {
        Message msg = new Message(yourName, "Hello" + yourName);
        return msg;
    }



}
