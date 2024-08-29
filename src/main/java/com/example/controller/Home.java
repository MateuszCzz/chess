package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.qos.logback.core.model.Model;

@Controller
public class Home {
    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String getHelloMessage() {
        return "<p>Hello from Spring Boot and HTMX!</p>";
    }

}
