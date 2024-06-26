package com.learningjava.rest_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_Details")

public class EmployeeDetails {
 
  @Id
  private String employeeId;
  private String employeeName;
  private String employeeRole;
  private String employeeAddress;
  private String employeePhoneNumber;
  private String employeePassword;

  public EmployeeDetails() {}

  public EmployeeDetails(String employeeId, String employeePassword, String employeeName, String employeeRole, String employeeAddress, String employeePhoneNumber) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.employeeRole = employeeRole;
    this.employeeAddress = employeeAddress;
    this.employeePhoneNumber = employeePhoneNumber;
    this.employeePassword = employeePassword;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public String getEmployeeRole() {
    return employeeRole;
  }

  public void setEmployeeRole(String employeeRole) {
    this.employeeRole = employeeRole;
  }

  public String getEmployeeAddress() {
    return employeeAddress;
  }

  public void setEmployeeAddress(String employeeAddress) {
    this.employeeAddress = employeeAddress;
  }

  public String getEmployeePhoneNumber() {
    return employeePhoneNumber;
  }

  public void setEmployeePhoneNumber(String employeePhoneNumber) {
    this.employeePhoneNumber = employeePhoneNumber;
  }

  public void setEmployeePassword(String employeePassword) {
    this.employeePassword = employeePassword;
  }

  public String getEmployeePassword() {
    return employeePassword;
  }

  @Override
  public String toString() {
    return "EmployeeDetails{" +
    "employeeId='" + employeeId + '\'' +
    ", employeeName='" + employeeName + '\'' +
    ", employeeRole='" + employeeRole + '\'' +
    ", employeeAddress='" + employeeAddress + '\'' +
    ", employeePhoneNumber='" + employeePhoneNumber + '\'' +
            "employeePassword='" + employeePassword + '\'' +
    '}';
  }
}
