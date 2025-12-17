package com.hotelbooking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "hotels")
public class Hotel {
    
    @Id
    @Column(name = "hotel_id")
    private int hotelId;

    @Column(name = "hotel_name")
    private String hotelName;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_no")
    private string phoneNo;

    @Column(name = "email")
    private string email;

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
