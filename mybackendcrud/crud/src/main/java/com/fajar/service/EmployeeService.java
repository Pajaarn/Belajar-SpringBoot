package com.fajar.service;

import com.fajar.model.Employee;
import com.fajar.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepo;

    public EmployeeService(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }

    public Optional<Employee> getByCode(String code) {
        return employeeRepo.findById(code);
    }

    public Employee create(Employee emp) {
        return employeeRepo.save(emp);
    }

    public List<Employee> createBulk(List<Employee> employees) {
        return employeeRepo.saveAll(employees);
    }

    public Employee update(String code, Employee updated) {
        return employeeRepo.findById(code)
                .map(emp -> {
                    emp.setEmpName(updated.getEmpName());
                    emp.setEmpAddress(updated.getEmpAddress());
                    emp.setEmpZipCode(updated.getEmpZipCode());
                    emp.setEmpDOB(updated.getEmpDOB());
                    return employeeRepo.save(emp);
                })
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public void delete(String code) {
        employeeRepo.deleteById(code);
    }

    public List<Employee> searchEmployees(String name, String zipcode) {
        if (name != null && zipcode != null) {
            return employeeRepo.findByEmpNameContainingIgnoreCaseAndEmpZipCode(name, zipcode);
        }
        if (name != null) {
            return employeeRepo.findByEmpNameContainingIgnoreCase(name);
        }
        if (zipcode != null) {
            return employeeRepo.findByEmpZipCode(zipcode);
        }
        return employeeRepo.findAll();
    }
}
