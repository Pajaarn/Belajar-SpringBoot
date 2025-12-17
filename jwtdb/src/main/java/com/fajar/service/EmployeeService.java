package com.fajar.service;

import com.fajar.entity.Employee;
import com.fajar.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public Employee save(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> findAll() {
        return repo.findAll();
    }

    public Employee findByCode(String code) {
        return repo.findById(code).orElseThrow();
    }

    public void delete(String code) {
        repo.deleteById(code);
    }

    public List<Employee> search(String name, String zip) {
        if (name != null && zip != null) {
            return repo.findByEmpNameContainingIgnoreCaseAndEmpZipCode(name,
                    zip);
        }
        if (name != null) {
            return repo.findByEmpNameContainingIgnoreCase(name);
        }
        if (zip != null) {
            return repo.findByEmpZipCode(zip);
        }
        return repo.findAll();
    }
}
