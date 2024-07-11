package com.learningjava.rest_demo.service.impl;

import com.learningjava.rest_demo.model.EmployeeDetails;
import com.learningjava.rest_demo.repository.EmployeeInfoRepository;
import com.learningjava.rest_demo.service.EmployeeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailService {

    private final EmployeeInfoRepository employeeInfoRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public EmployeeDetailsServiceImpl(EmployeeInfoRepository employeeInfoRepository, BCryptPasswordEncoder passwordEncoder) {
        this.employeeInfoRepository = employeeInfoRepository;
        this.passwordEncoder = passwordEncoder;
        System.out.println("EmployeeDetailsServiceImpl instantiated");
    }

    @Override
    public String createEmployeeDetails(EmployeeDetails employeeDetails) {
        employeeDetails.setEmployeePassword(passwordEncoder.encode(employeeDetails.getEmployeePassword()));
        employeeInfoRepository.save(employeeDetails);
        return "Created successfully";
    }

    @Override
    public String updateEmployeeDetails(EmployeeDetails employeeDetails) {
        employeeDetails.setEmployeePassword(passwordEncoder.encode(employeeDetails.getEmployeePassword()));
        employeeInfoRepository.save(employeeDetails);
        return "Update successful";
    }

    @Override
    public String deleteEmployeeDetails(String employeeId) {
        if(employeeInfoRepository.existsById(employeeId)) {
            employeeInfoRepository.deleteById(employeeId);
            return "Deleted successfully";
        } else {
            return "Employee not found";
        }
    }

    @Override
    public EmployeeDetails getEmployeeDetails(String employeeId) {
        Optional<EmployeeDetails> employeeDetails = employeeInfoRepository.findById(employeeId);
        return employeeDetails.orElse(null);
    }

    @Override
    public List<EmployeeDetails> getAllEmployeesDetails() {
        System.out.println("getAllEmployeesDetails method in service called");
        return employeeInfoRepository.findAll();
    }
}
