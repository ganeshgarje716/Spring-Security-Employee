package com.ganesh.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.Dto.EmployeeDto;
import com.ganesh.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeRestController {
	
	
	private final EmployeeService employeeService;
	
	
	public EmployeeRestController(EmployeeService employeeService) {
		
		this.employeeService=employeeService;
	}
	
	
	@PostMapping("/save")
	public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
		
		EmployeeDto saveEmployee = employeeService.saveEmployee(employeeDto);
		
		return new ResponseEntity<EmployeeDto>(saveEmployee, HttpStatus.CREATED);
	}
	
	

}
