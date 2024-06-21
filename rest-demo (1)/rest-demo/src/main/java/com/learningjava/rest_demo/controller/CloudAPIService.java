package com.learningjava.rest_demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningjava.rest_demo.model.EmployeeDetials;

@RestController
@RequestMapping("/employee")
public class CloudAPIService {

    EmployeeDetials employeeDetials;

    @GetMapping("{employeeId}")
    public EmployeeDetials getEmployeeDetials( String employeeId) {
        return employeeDetials;
        //  new EmployeeDetials("bbb", "John Doe", "Software Engineer", "123 Main St", "555-1234");
    }

    @PostMapping
    public String createEmployeeDetials(@RequestBody EmployeeDetials employeeDetials) 
    {
        this.employeeDetials = employeeDetials;
        return "Employee detials was created successfully";
    }

    @PutMapping
    public String updateEmployeeDetials(@RequestBody EmployeeDetials employeeDetials)
    {
        this.employeeDetials = employeeDetials;
        return "Employee detials have been updated successfully";
    }

    @DeleteMapping("{employeeId}")
    public String deleteEmployeeDetials(String employeeId)
    {
        this.employeeDetials = null;
        return "Employee detials have been deleted successfully";
    }
} 

