package com.ganesh.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	@Column(unique = true)
	private String email;
	
	@Column(unique = true)
	private String mobileNo;
	
	private String gender;
	
	private String dep;
	
	private Double salary;
	
	@CreationTimestamp
	private LocalDate joningDate;
	
	private LocalDate dob;
	
	private String status;
	
	private Boolean isMarried;
	
	private Integer experience;
	
	private String educationQualification;
	
	private String address;
	
	private Integer age;
	
	private String designation;
	
	
	
	
	
	
}
