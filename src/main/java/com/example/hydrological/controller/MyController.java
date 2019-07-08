package com.example.hydrological.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/my")
    String home() {
        return "Hello World!";
    }
}