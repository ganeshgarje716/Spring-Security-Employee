package com.ganesh.service.ipm;

import org.springframework.stereotype.Service;

import com.ganesh.Dto.EmployeeDto;
import com.ganesh.entity.Employee;
import com.ganesh.repository.EmployeeRepository;
import com.ganesh.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService{
	
	
	private final EmployeeRepository employeeRepository;

	
	public EmployeeServiceImp(EmployeeRepository employeeRepository) {
		
		this.employeeRepository=employeeRepository;
	}
	
	
	
	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {

		Employee employee=new Employee();
		
		employee.setFirstName(employeeDto.getFirstName());
		employee.setLastName(employeeDto.getLastName());
		employee.setEmail(employeeDto.getEmail());
		employee.setMobileNo(employeeDto.getMobileNo());
		employee.setGender(employeeDto.getGender());
		employee.setDep(employeeDto.getDep());
		employee.setSalary(employeeDto.getSalary());
		employee.setDob(employeeDto.getDob());
		employee.setStatus(employeeDto.getStatus());
		employee.setIsMarried(employeeDto.getIsMarried());
		employee.setExperience(employeeDto.getExperience());
		employee.setEducationQualification(employeeDto.getEducationQualification());
		employee.setAddress(employeeDto.getAddress());
		employee.setAge(employeeDto.getAge());
		employee.setDesignation(employeeDto.getDesignation());
		
		Employee saved = employeeRepository.save(employee);
		
		employeeDto.setId(saved.getId());
		employeeDto.setFirstName(saved.getFirstName());
		employeeDto.setLastName(saved.getLastName());
		employeeDto.setEmail(saved.getEmail());
		employeeDto.setMobileNo(saved.getMobileNo());
		employeeDto.setGender(saved.getGender());
		employeeDto.setDep(saved.getDep());
		employeeDto.setSalary(saved.getSalary());
		employeeDto.setJoningDate(saved.getJoningDate());
		employeeDto.setDob(saved.getDob());
		employeeDto.setStatus(saved.getStatus());
		employeeDto.setIsMarried(saved.getIsMarried());
		employeeDto.setExperience(saved.getExperience());
		employeeDto.setEducationQualification(saved.getEducationQualification());
		employeeDto.setAddress(saved.getAddress());
		employeeDto.setAge(saved.getAge());
		employeeDto.setDesignation(saved.getDesignation());
		
		
		return employeeDto;
	}

}
