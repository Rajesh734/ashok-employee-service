package com.ashok.employee.rest.fiegn;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("ashok-db-service")
public interface DBServiceClient {
	@RequestMapping(value = "/get-by-email", method = RequestMethod.GET, params = { "email" })
	List<?> getEmail(@RequestParam String email);
	
	@GetMapping(value = "/get-user-by-id/{id}")
	String getUserById(@PathVariable long id);
}
