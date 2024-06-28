package com.learningjava.rest_demo.service;

import com.learningjava.rest_demo.model.EmployeeDetails;
import com.learningjava.rest_demo.repository.EmployeeInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private EmployeeInfoRepository employeeRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        EmployeeDetails employeeDetails = employeeRepository.findByEmployeeId(username);
        if (employeeDetails == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new MyUserDetails(employeeDetails);
    }
}
