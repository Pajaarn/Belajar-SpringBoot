package com.fajar.controller;

import com.fajar.entity.Employee;
import com.fajar.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping
    public Employee create(@RequestBody Employee emp) {
        return service.save(emp);
    }

    @GetMapping
    public List<Employee> list(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String zipcode) {
        return service.search(name, zipcode);
    }

    @GetMapping("/{code}")
    public Employee detail(@PathVariable String code) {
        return service.findByCode(code);
    }

    @PutMapping("/{code}")
    public Employee update(@PathVariable String code,
            @RequestBody Employee emp) {
        emp.setEmpCode(code);
        return service.save(emp);
    }

    @DeleteMapping("/{code}")
    public void delete(@PathVariable String code) {
        service.delete(code);
    }
}
