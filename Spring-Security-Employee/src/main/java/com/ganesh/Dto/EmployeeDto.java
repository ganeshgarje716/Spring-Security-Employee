package com.ganesh.Dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class EmployeeDto {
	
	
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String mobileNo;
	
	private String gender;
	
	private String dep;
	
	private Double salary;
	
	private LocalDate dob;
	
	private String status;
	
	private Boolean isMarried;
	
	private Integer experience;
	
	private String educationQualification;
	
	private String address;
	
	private Integer age;
	
	private String designation;

}
