package com.vg.employeeproject.service;

import com.vg.employeeproject.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAllEmployees();

    Employee findById(int id);

    Employee save(Employee e);

    void deleteById(int id);
}
