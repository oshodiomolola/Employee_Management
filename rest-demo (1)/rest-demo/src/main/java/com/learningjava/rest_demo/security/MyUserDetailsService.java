package com.learningjava.rest_demo.security;

import com.learningjava.rest_demo.model.EmployeeDetails;
import com.learningjava.rest_demo.repository.EmployeeInfoRepository;
import com.learningjava.rest_demo.service.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private EmployeeInfoRepository employeeInfoRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        EmployeeDetails employeeDetails = employeeInfoRepository.findByEmployeeId(username);
        if (employeeDetails == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new MyUserDetails(employeeDetails);
    }
}
