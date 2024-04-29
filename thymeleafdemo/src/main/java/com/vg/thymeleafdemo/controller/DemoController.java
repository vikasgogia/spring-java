package com.vg.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class DemoController {

    @GetMapping("/")
    public String sayHello(Model model) {
        model.addAttribute("date", LocalDateTime.now());
        return "helloworld";
    }
}
