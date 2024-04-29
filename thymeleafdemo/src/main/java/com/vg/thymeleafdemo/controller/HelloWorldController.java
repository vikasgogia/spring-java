package com.vg.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/show-form")
    public String showForm() {
        return "showform";
    }

    @GetMapping("/process-form")
    public String processForm() {
        return "processform";
    }
}
