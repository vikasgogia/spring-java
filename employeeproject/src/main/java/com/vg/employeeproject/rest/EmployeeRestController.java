package com.vg.employeeproject.rest;

import com.vg.employeeproject.entity.Employee;
import com.vg.employeeproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService service;

    @Autowired
    public EmployeeRestController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return service.findAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee findEmployee(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee e) {
        e.setId(0); // for adding an employee
        return service.save(e);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee e) {
        return service.save(e);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id) {
        service.deleteById(id);
    }
}
