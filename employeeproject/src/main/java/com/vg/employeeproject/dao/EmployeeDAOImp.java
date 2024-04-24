package com.vg.employeeproject.dao;

import com.vg.employeeproject.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImp implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = entityManager.createQuery("FROM Employee ORDER BY firstName", Employee.class);
        return query.getResultList();
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee save(Employee e) {
        // if e's id is 0, it's save else it's update
        return entityManager.merge(e);
    }

    @Override
    public void deleteById(int id) {
        Employee e = entityManager.find(Employee.class, id);
        entityManager.remove(e);
    }
}
