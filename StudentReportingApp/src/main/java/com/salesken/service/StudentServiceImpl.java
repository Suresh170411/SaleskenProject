package com.salesken.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesken.exception.StudentException;
import com.salesken.model.Student;
import com.salesken.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepo;
	
	// adding one student along with it's semester marks
	@Override
	public Student addStudentAndMarks(Student student) throws StudentException {
		
		return studentRepo.save(student);
		
	}

	// getting all the average marks of the whole class on the first semester
	@Override
	public double getWholeClassAverageMarksSem1() throws StudentException {
		
		List<Student> allStudents = studentRepo.findAll();
		
		double totalObtainedMarks = 0;
		double totalStudents = allStudents.size();
		
		if (allStudents.size() == 0) {
			throw new StudentException("There are no students to be evaluate for this semester !");
		}else {
			
			for (Student s : allStudents) {
				
				totalObtainedMarks+= (s.getSemesterMarks().getSemester1_english() 
						+ s.getSemesterMarks().getSemester1_math() 
						+ s.getSemesterMarks().getSemester1_science());
			}
			// for calculating the percentage
			double totalSubjectsMarks = 100 * (totalStudents*3);
			
			double avaragePercentage = ( totalObtainedMarks * 100 ) / totalSubjectsMarks;
			
			return avaragePercentage;
			
		}
	}

	// getting all the average marks of the whole class on the second semester
	@Override
	public double getWholeClassAverageMarksSem2() throws StudentException {
		
		List<Student> allStudents = studentRepo.findAll();
		
		double totalObtainedMarks = 0;
		double totalStudents = allStudents.size();
		
		if (allStudents.size() == 0) {
			throw new StudentException("There are no students to be evaluate for this semester !");
		}else {
			
			for (Student s : allStudents) {
				
				totalObtainedMarks+= (s.getSemesterMarks().getSemester2_english() 
						+ s.getSemesterMarks().getSemester2_math() 
						+ s.getSemesterMarks().getSemester2_science());
			}
			// for calculating the percentage
			double totalSubjectsMarks = 100 * (totalStudents*3);
			
			double avaragePercentage = ( totalObtainedMarks * 100 ) / totalSubjectsMarks;
			
			return avaragePercentage;
			
		}
	}

	@Override
	public Integer getAverageMarksInEnglish() throws StudentException {
		
		List<Student> list = studentRepo.findAll();
		
		double semester1 = 0;
		double semester2 = 0;
		
		for (Student s : list) {
			semester1+= s.getSemesterMarks().getSemester1_english();
			semester2+= s.getSemesterMarks().getSemester2_english();
		}
		
		double totalObtainedMarks = semester1 + semester2;
		
		double average = ( totalObtainedMarks * 100 ) / (200 * list.size());
		
		return (int) average;
	}

	@Override
	public Integer getAverageMarksInMath() throws StudentException {
		
		List<Student> list = studentRepo.findAll();
		
		double semester1 = 0;
		double semester2 = 0;
		
		for (Student s : list) {
			semester1+= s.getSemesterMarks().getSemester1_math();
			semester2+= s.getSemesterMarks().getSemester2_math();
		}
		
		double totalObtainedMarks = semester1 + semester2;
		
		double average = ( totalObtainedMarks * 100 ) / (200 * list.size());
		
		return (int) average;
	}

	@Override
	public Integer getAverageMarksInScience() throws StudentException {
		
		List<Student> list = studentRepo.findAll();
		
		double semester1 = 0;
		double semester2 = 0;
		
		for (Student s : list) {
			semester1+= s.getSemesterMarks().getSemester1_science();
			semester2+= s.getSemesterMarks().getSemester2_science();
		}
		
		double totalObtainedMarks = semester1 + semester2;
		
		double average = ( totalObtainedMarks * 100 ) / (200 * list.size());
		
		return (int) average;
	}

//	@Override
//	public List<Student> top2Students() {
//		
//		List<Student> list = studentRepo.findAll();
//		
//		return list;
//	}

	@Override
	public Student getReportCardOfAStudent(Integer roll) throws StudentException {
		
		Optional<Student> student = studentRepo.findByRoll(roll);
		
		if (student.isEmpty()) {
			throw new StudentException("No student found with this roll !");
		}else {
			return student.get();
		}
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}


	
	
	

}
