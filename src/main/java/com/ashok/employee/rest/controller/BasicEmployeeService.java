/**
 * 
 */
package com.ashok.employee.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.employee.rest.model.Employee;

/**
 * @author rakkin493
 *
 */
@RestController
public class BasicEmployeeService {
    
    @Autowired
    private Employee employee;
    
    @GetMapping("/emp-details/{id}")
    public Employee getEmployeeDetails(@PathVariable String id) {
        employee.setAge(20);
        employee.setFirstName("Aaryan");
        employee.setLastName("AshokKumar");
        employee.setId(id);
        return employee;
    }
}
