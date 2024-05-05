package com.vg.thymeleafdemo.controller;

import com.vg.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @Value("${os}")
    private List<String> os;

    @GetMapping("/show-student-form")
    public String showStudentForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("countries", countries);
        model.addAttribute("languages", languages);
        model.addAttribute("os", os);
        return "studentform";
    }

    @PostMapping("/process-student-form")
    public String processStudentForm(@ModelAttribute("student") Student student) {
        return "processstudentform";
    }
}
