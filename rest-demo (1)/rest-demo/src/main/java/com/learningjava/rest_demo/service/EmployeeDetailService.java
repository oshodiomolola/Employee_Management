package com.learningjava.rest_demo.service;

import com.learningjava.rest_demo.model.EmployeeDetails;

import java.util.List;

public interface EmployeeDetailService {

    String createEmployeeDetails(EmployeeDetails employeeDetails);

    String updateEmployeeDetails(EmployeeDetails employeeDetails);

    String deleteEmployeeDetails(String employeeId);

    EmployeeDetails getEmployeeDetails(String employeeId);

    List<EmployeeDetails> getAllEmployeesDetails();
}

