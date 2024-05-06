package com.vg.thymeleafdemo.controller;

import com.vg.thymeleafdemo.model.Student;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
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

    @InitBinder
    public void addMiddleware(WebDataBinder wdb) {
        // preprocess every String form data
        // removes leading & trailing white spaces
        StringTrimmerEditor ste = new StringTrimmerEditor(true);
        wdb.registerCustomEditor(String.class, ste);
    }


    @GetMapping("/show-student-form")
    public String showStudentForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("countries", countries);
        model.addAttribute("languages", languages);
        model.addAttribute("os", os);
        return "studentform";
    }

    @PostMapping("/process-student-form")
    public String processStudentForm(@Valid @ModelAttribute("student") Student student, BindingResult br) {
        if(br.hasErrors()) return "studentform";
        return "processstudentform";
    }
}
