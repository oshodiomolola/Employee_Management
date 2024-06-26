package com.learningjava.rest_demo.controller;

import com.learningjava.rest_demo.model.EmployeeDetails;
import com.learningjava.rest_demo.service.EmployeeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeInfoController {

    private final EmployeeDetailService employeeDetailService;

    @Autowired
    public EmployeeInfoController(EmployeeDetailService employeeDetailService) {
        this.employeeDetailService = employeeDetailService;
        System.out.println("EmployeeInfoController instantiated with EmployeeDetailService");
    }

    @GetMapping("{employeeId}")
    public EmployeeDetails getEmployeeDetails(@PathVariable("employeeId") String employeeId) {
        return employeeDetailService.getEmployeeDetails(employeeId);
    }

    @GetMapping
    public List<EmployeeDetails> getAllEmployeesDetails() {
        System.out.println("getAllEmployeesDetails method called");
        return employeeDetailService.getAllEmployeesDetails();
    }

    @PostMapping
    public String createEmployeeDetails(@RequestBody EmployeeDetails employeeDetails) {
        employeeDetailService.createEmployeeDetails(employeeDetails);
        return "Employee details have been created successfully";
    }

    @PutMapping
    public String updateEmployeeDetails(@RequestBody EmployeeDetails employeeDetails) {
        employeeDetailService.updateEmployeeDetails(employeeDetails);
        return "Employee details have been updated successfully";
    }

    @DeleteMapping("{employeeId}")
    public String deleteEmployeeDetails(@PathVariable("employeeId") String employeeId) {
        employeeDetailService.deleteEmployeeDetails(employeeId);
        return "Employee details have been deleted successfully";
    }
}

