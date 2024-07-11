package com.learningjava.rest_demo.config;

import com.learningjava.rest_demo.model.EmployeeDetails;
import com.learningjava.rest_demo.repository.EmployeeInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EmployeeInfoRepository employeeInfoRepository;

    @Override
    public void run(String... args) throws Exception {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode("mySecretKey");

        EmployeeDetails employee = new EmployeeDetails();
        employee.setEmployeeId("01");
        employee.setEmployeePassword(encodedPassword);
        employee.setEmployeeName("Admin User");
        employee.setEmployeeRole("Engineer");
        employee.setEmployeeAddress("lagos, Nigeria");
        employee.setEmployeePhoneNumber("55-6567-65");

        employeeInfoRepository.save(employee);
    }
}
