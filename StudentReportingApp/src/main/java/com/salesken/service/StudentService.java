package com.salesken.service;

import java.util.List;

import com.salesken.exception.StudentException;
import com.salesken.model.Student;

public interface StudentService {
	
	Student addStudentAndMarks(Student student) throws StudentException;
	
	double getWholeClassAverageMarksSem1() throws StudentException;
	
	double getWholeClassAverageMarksSem2() throws StudentException;
	
	Integer getAverageMarksInEnglish() throws StudentException;
	
	Integer getAverageMarksInMath() throws StudentException;
	
	Integer getAverageMarksInScience() throws StudentException;
	
	List<Student> getAllStudent();
	
//	List<Student> top2Students();
	
	Student getReportCardOfAStudent(Integer roll) throws StudentException;
}
