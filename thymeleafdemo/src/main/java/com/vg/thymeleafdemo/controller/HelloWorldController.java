package com.vg.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/process-form2")
    public String processForm2(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName").toUpperCase();
        model.addAttribute("sName", name);
        return "processform";
    }

    @PostMapping("/process-form3")
    public String processForm3(@RequestParam("studentName") String name, Model model) {
        model.addAttribute("sName", name.toUpperCase());
        return "processform";
    }
}
