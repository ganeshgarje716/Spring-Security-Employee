package com.ganesh.service.ipm;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ganesh.Dto.EmployeeDto;
import com.ganesh.entity.Employee;
import com.ganesh.exception.EmployeeNotFoundException;
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



	@Override
	public List<Employee> findAllEmployees() {
		
		return employeeRepository.findAll();
	}



	@Override
	public Employee findEmployeeById(Integer id) {

		Optional<Employee> byId = employeeRepository.findById(id);
		
		if (byId.isPresent()) {
			
			Employee employee = byId.get();
			
			return employee;
		}
		
		throw new EmployeeNotFoundException("Employee Not Found With Id = "+id);
	}



	@Override
	public String updateEmployeeById(Integer id, Employee employee) {

		Optional<Employee> byId = employeeRepository.findById(id);
		
		if (byId.isPresent()) {
			
			Employee existing = byId.get();
			
			existing.setFirstName(employee.getFirstName());
			existing.setLastName(employee.getLastName());
			existing.setEmail(employee.getEmail());
			existing.setMobileNo(employee.getMobileNo());
			existing.setGender(employee.getGender());
			existing.setDep(employee.getDep());
			existing.setSalary(employee.getSalary());
			existing.setDob(employee.getDob());
			existing.setStatus(employee.getStatus());
			existing.setIsMarried(employee.getIsMarried());
			existing.setExperience(employee.getExperience());
			existing.setEducationQualification(employee.getEducationQualification());
			existing.setAddress(employee.getAddress());
			existing.setAge(employee.getAge());
			existing.setDesignation(employee.getDesignation());			
			
			employeeRepository.save(existing);
			
			return "Employee Update Success";
		}
		
		throw new EmployeeNotFoundException("Employee Not Found With Id = "+id);
	}

}
