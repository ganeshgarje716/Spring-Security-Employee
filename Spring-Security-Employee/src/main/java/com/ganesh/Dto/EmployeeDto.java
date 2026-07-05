package com.ganesh.Dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EmployeeDto {
	
	
	
	private Integer id;
	
	@NotNull(message = "First Name is Required")
	private String firstName;
	
	@NotNull(message = "Last Name is Required")
	private String lastName;
	
	@NotNull(message = "Email is Required")
	private String email;
	
	@NotNull(message = "Mobile No is Required")
	private String mobileNo;
	
	@NotNull(message = "Gender is Required")
	private String gender;
	
	@NotNull(message = "Department is Required")
	private String dep;
	
	@NotNull(message = "Salary is Required")
	private Double salary;
	
	private LocalDate joningDate;
	
	@NotNull(message = "Date of Birth is Required")
	private LocalDate dob;
	
	@NotNull(message = "Status is Required")
	private String status;
	
	@NotNull(message = "Is Married is Required")
	private Boolean isMarried;
	
	@NotNull(message = "Experience is Required")
	private Integer experience;
	
	@NotNull(message = "Education Qualification is Required")
	private String educationQualification;
	
	@NotNull(message = "Address is Required")
	private String address;
	
	@NotNull(message = "Age is Required")
	private Integer age;
	
	@NotNull(message = "Designation is Required")
	private String designation;

}
