package com.salesken.model;

import jakarta.persistence.Id;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studentId;
	
	private Integer roll;
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Embedded
	private Address address;
	
	@Embedded
	private SemesterMarks semesterMarks;
}
