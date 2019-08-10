package com.ashok.employee.rest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.ashok.employee.rest.model.Employee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AshokEmployeeServiceApplicationTests {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

	@Test
	public void testGetEmployeeDetails() {
	    ResponseEntity<Employee> employeeResponseEntity = this.restTemplate.postForEntity("http://localhost:" + port + "/emp-details/23", null,
                Employee.class);
	    log.info("testGetEmployeeDetails rest respomnse: {}", employeeResponseEntity.getBody());
	    assertThat(null != employeeResponseEntity.getBody());
	}

}
