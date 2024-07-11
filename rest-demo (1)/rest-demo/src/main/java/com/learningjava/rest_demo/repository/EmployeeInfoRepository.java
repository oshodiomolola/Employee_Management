package com.learningjava.rest_demo.repository;

import com.learningjava.rest_demo.model.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeInfoRepository extends JpaRepository<EmployeeDetails, String> {
    Optional<EmployeeDetails> findByEmployeePhoneNumber(String phoneNumber);
}

