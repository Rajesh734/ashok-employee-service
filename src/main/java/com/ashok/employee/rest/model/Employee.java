/**
 * 
 */
package com.ashok.employee.rest.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author rakkin493
 *
 */
@Component
@Scope("prototype")
@Data
public class Employee {
    String firstName;
    String lastName;
    String id;
    String id1;
    int age;
}
