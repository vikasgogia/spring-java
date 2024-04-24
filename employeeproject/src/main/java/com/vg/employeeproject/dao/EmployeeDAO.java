package com.vg.employeeproject.dao;

import com.vg.employeeproject.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee e);

    void deleteById(int id);
}
