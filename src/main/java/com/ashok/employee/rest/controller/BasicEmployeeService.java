/**
 * 
 */
package com.ashok.employee.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
    
    @PostMapping("/emp-details/{id}")
    public Employee getEmployeeDetails(@PathVariable String id) {
        employee.setAge(20);
        employee.setFirstName("Aaryan");
        employee.setLastName("AshokKumar");
        employee.setId(id);
        return employee;
    }
    
    @GetMapping("/fetchAllEmployees")
    public List<Employee> fetchAllEmplloyees() {
        List<Employee> listOfEmployee = new ArrayList<>();
        Employee e1 = new Employee();
        e1.setAge(20);
        e1.setFirstName("Aaryan");
        e1.setLastName("AshokKumar");
        e1.setId("1");
        
        listOfEmployee.add(employee);
        
        employee.setAge(10);
        employee.setFirstName("Sivanya");
        employee.setLastName("AshokKumar");
        employee.setId("2");
        listOfEmployee.add(employee);
        return listOfEmployee;
    }
}
