package com.fajar.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    @Id
    @Column(name = "EmpCode", length = 5)
    private String empCode;

    @Column(name = "EmpName")
    private String empName;

    @Column(name = "EmpAddress")
    private String empAddress;

    @Column(name = "EmpZipCode")
    private String empZipCode;
    
    @Column(name = "EmpDOB")
    private LocalDate empDOB;
}
