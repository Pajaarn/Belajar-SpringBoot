package com.fajar.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "EmpCode")
    private String empCode;

    @Column(name = "EmpName")
    private String empName;

    @Column(name = "EmpAddress")
    private String empAddress;

    @Column(name = "EmpZipCode")
    private String empZipCode;

    @Column(name = "EmpDOB")
    private LocalDate empDOB;

    public Employee() {
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpZipCode() {
        return empZipCode;
    }

    public void setEmpZipCode(String empZipCode) {
        this.empZipCode = empZipCode;
    }

    public LocalDate getEmpDOB() {
        return empDOB;
    }

    public void setEmpDOB(LocalDate empDOB) {
        this.empDOB = empDOB;
    }
}
