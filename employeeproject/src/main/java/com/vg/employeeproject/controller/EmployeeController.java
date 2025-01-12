package com.vg.employeeproject.controller;

import com.vg.employeeproject.entity.Employee;
import com.vg.employeeproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employees")
public class EmployeeController {

    private EmployeeService service;

    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/list")
    public String listEmployees(Model model) {
        model.addAttribute("employees", service.findAllEmployees());
        return "list-emp";
    }
}
