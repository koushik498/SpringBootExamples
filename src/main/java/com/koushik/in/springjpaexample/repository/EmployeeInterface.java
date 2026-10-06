package com.koushik.in.springjpaexample.repository;

import com.koushik.in.springjpaexample.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeInterface extends JpaRepository<Employee, Long> {
    List<Employee> findByEmpDesignation(String department);
}
