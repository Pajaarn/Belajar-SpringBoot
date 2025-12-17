package com.fajar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fajar.model.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
    List<Employee> findByEmpNameContainingIgnoreCase(String empName);

    List<Employee> findByEmpZipCode(String empZipCode);

    List<Employee> findByEmpNameContainingIgnoreCaseAndEmpZipCode(
            String empName,
            String empZipCode);
}
