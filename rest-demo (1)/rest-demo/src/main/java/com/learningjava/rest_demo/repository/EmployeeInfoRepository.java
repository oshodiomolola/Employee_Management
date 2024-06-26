package com.learningjava.rest_demo.repository;

import com.learningjava.rest_demo.model.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeInfoRepository extends JpaRepository<EmployeeDetails, String> {
EmployeeDetails findByEmployeeId( String employeeId);
}

