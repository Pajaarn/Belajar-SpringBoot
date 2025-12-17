package com.fajar.repository;

import com.fajar.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
    List<Employee> findByEmpNameContainingIgnoreCase(String empName);

    List<Employee> findByEmpZipCode(String empZipCode);

    List<Employee> findByEmpNameContainingIgnoreCaseAndEmpZipCode(
            String empName, String empZipCode);
}
