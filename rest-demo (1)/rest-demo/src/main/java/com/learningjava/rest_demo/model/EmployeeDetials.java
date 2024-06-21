package com.learningjava.rest_demo.model;

public class EmployeeDetials {
  
  private String employeeId;
  private String employeeName;
  private String employeeRole;
  private String employeeAddress;
  private String employeePhoneNumber;

  public EmployeeDetials() {}

  public EmployeeDetials(String employeeId, String employeeName, String employeeRole, String employeeAddress, String employeePhoneNumber) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.employeeRole = employeeRole;
    this.employeeAddress = employeeAddress;
    this.employeePhoneNumber = employeePhoneNumber;
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

  @Override
  public String toString() {
    return "EmployeeDetials{" +
    "employeeId='" + employeeId + '\'' +
    ", employeeName='" + employeeName + '\'' +
    ", employeeRole='" + employeeRole + '\'' +
    ", employeeAddress='" + employeeAddress + '\'' +
    ", employeePhoneNumber='" + employeePhoneNumber + '\'' +
    '}';
  }
}
