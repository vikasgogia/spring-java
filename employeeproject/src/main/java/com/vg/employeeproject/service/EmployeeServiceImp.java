package com.vg.employeeproject.service;

import com.vg.employeeproject.dao.EmployeeRepository;
import com.vg.employeeproject.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp implements EmployeeService {

//    private EmployeeDAO employeeDAO;
    private EmployeeRepository repo;

    @Autowired
    public EmployeeServiceImp(EmployeeRepository employeeRepository) {
        repo = employeeRepository;
    }

    @Override
    public List<Employee> findAllEmployees() {
        return repo.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> res = repo.findById(id);
        if(res.isPresent()) return res.get();
        else throw new RuntimeException("No employee found");
    }

    @Override
    public Employee save(Employee e) {
        return repo.save(e);
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);
    }
}
