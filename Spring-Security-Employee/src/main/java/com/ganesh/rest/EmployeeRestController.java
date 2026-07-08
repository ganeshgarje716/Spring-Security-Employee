package com.ganesh.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.Dto.EmployeeDto;
import com.ganesh.entity.Employee;
import com.ganesh.service.EmployeeService;

import jakarta.persistence.GeneratedValue;

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
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> findAllEmployees() {
		
		List<Employee> allEmployees = employeeService.findAllEmployees();
		
		return new ResponseEntity<List<Employee>>(allEmployees, HttpStatus.OK);
	}
	
	
	@GetMapping("/byid/{id}")
	public ResponseEntity<Employee> findEmployeeById(@PathVariable Integer id) {
		
		Employee employeeById = employeeService.findEmployeeById(id);
		
		return new ResponseEntity<Employee>(employeeById, HttpStatus.OK);
	}
	
	

}
