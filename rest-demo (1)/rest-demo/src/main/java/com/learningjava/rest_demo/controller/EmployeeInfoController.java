package com.learningjava.rest_demo.controller;

import com.learningjava.rest_demo.model.EmployeeDetails;
import com.learningjava.rest_demo.service.EmployeeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping("/{employeeId}")
    public ResponseEntity<EmployeeDetails> getEmployeeDetails(@PathVariable("employeeId") String employeeId) {
        EmployeeDetails employee = employeeDetailService.getEmployeeDetails(employeeId);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDetails>> getAllEmployeesDetails() {
        List<EmployeeDetails> employees = employeeDetailService.getAllEmployeesDetails();
        return ResponseEntity.ok(employees);
    }

    @PostMapping
    public ResponseEntity<String> createEmployeeDetails(@Valid @RequestBody EmployeeDetails employeeDetails) {
        String message = employeeDetailService.createEmployeeDetails(employeeDetails);
        return ResponseEntity.status(HttpStatus.CREATED).body(message);
    }

    @PutMapping
    public ResponseEntity<String> updateEmployeeDetails(@Valid @RequestBody EmployeeDetails employeeDetails) {
        String message = employeeDetailService.updateEmployeeDetails(employeeDetails);
        return ResponseEntity.ok(message);
    }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity<String> deleteEmployeeDetails(@PathVariable("employeeId") String employeeId) {
        String message = employeeDetailService.deleteEmployeeDetails(employeeId);
        return ResponseEntity.ok(message);
    }
}


