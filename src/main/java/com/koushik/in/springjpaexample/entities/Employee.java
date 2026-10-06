package com.koushik.in.springjpaexample.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "employee_table")
public class Employee {

    @Id
    @Column(name = "emp_id")
    private long empId;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "emp_designation")
    private String empDesignation;

    @Column(name = "emp_salary")
    private double empSalary;

    @Column(name = "emp_department")
    private String empDepartment;

    public Employee() {
    }

    public Employee(long empId,String empName,String empDesignation,double empSalary,String empDepartment){
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empDepartment = empDepartment;
    }


    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                ", empSalary=" + empSalary +
                ", empDepartment='" + empDepartment + '\'' +
                '}';
    }
}
