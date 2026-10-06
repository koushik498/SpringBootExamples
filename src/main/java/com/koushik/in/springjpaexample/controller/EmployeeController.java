package com.koushik.in.springjpaexample.controller;


import com.koushik.in.springjpaexample.entities.Employee;
import com.koushik.in.springjpaexample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/api/onboardEmployee")
    public Employee onboardEmployee(@RequestBody Employee employee) {
        return employeeService.onboardEmployee(employee);
    }

    @GetMapping("/api/getEmployeeById/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/api/getAllEmployees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/api/getEmployeeCount")
    public long countEmployees() {
        return employeeService.countEmployees();
    }

    @GetMapping("/api/getEmployeeByDesignation/{designation}")
    public List<Employee> getEmployeeByDesignation(@PathVariable String designation) {
        return employeeService.getEmployeeByDesignation(designation);
    }

}
