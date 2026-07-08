package com.ganesh.service;

import java.util.List;

import com.ganesh.Dto.EmployeeDto;
import com.ganesh.entity.Employee;

public interface EmployeeService {
	
	
	public EmployeeDto saveEmployee(EmployeeDto employeeDto);
	
	List<Employee> findAllEmployees();
	
	Employee findEmployeeById(Integer id);
	
	String updateEmployeeById(Integer id, Employee employee);

}
