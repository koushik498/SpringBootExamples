package com.koushik.in.springjpaexample.service;


import com.koushik.in.springjpaexample.entities.Employee;
import com.koushik.in.springjpaexample.repository.EmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeInterface employeeInterface;

    public Employee onboardEmployee(Employee employee) {
        return employeeInterface.save(employee);
    }

    public Employee getEmployeeById(Long id) {
        return employeeInterface.findById(id).orElse(null);
    }

    public List<Employee> getAllEmployees() {
        List<Employee> empList = employeeInterface.findAll();
        return empList.stream().filter(emp -> emp.getEmpDesignation().equals("SoftwareDeveloper")).toList();
    }

    public List<Employee> getEmployeeByDesignation(String designation) {
        return employeeInterface.findByEmpDesignation(designation);
    }

    public long countEmployees() {
        return employeeInterface.count();
    }
}
//Onboard new employee
//Get all employees
//Get employee by id
//Get employee by department
//Update employee
//Delete employee