package com.salesken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.salesken.exception.StudentException;
import com.salesken.model.Student;
import com.salesken.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentServ;
	
	@PostMapping("/students")
	public ResponseEntity<Student> addStudentHandler(@RequestBody Student student) throws StudentException{
		return new ResponseEntity<Student>(studentServ.addStudentAndMarks(student),HttpStatus.OK);
	}
	
	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> getReportHandler(@PathVariable ("roll") Integer roll) throws StudentException{
		return new ResponseEntity<Student>(studentServ.getReportCardOfAStudent(roll),HttpStatus.OK);
	}
	
	@GetMapping("/students/semester1")
	public ResponseEntity<Double> getAveragePercentofWholeClassSem1() throws StudentException{
		return new ResponseEntity<Double>(studentServ.getWholeClassAverageMarksSem1(),HttpStatus.OK);
	}
	
	@GetMapping("/students/semester2")
	public ResponseEntity<Double> getAveragePercentofWholeClassSem2() throws StudentException{
		return new ResponseEntity<Double>(studentServ.getWholeClassAverageMarksSem1(),HttpStatus.OK);
	}
	
	@GetMapping("/students/english")
	public ResponseEntity<Integer> getAveragePercentInEnglish() throws StudentException{
		return new ResponseEntity<Integer>(studentServ.getAverageMarksInEnglish(),HttpStatus.OK);
	}
	
	@GetMapping("/students/math")
	public ResponseEntity<Integer> getAveragePercentInMath() throws StudentException{
		return new ResponseEntity<Integer>(studentServ.getAverageMarksInMath(),HttpStatus.OK);
	}
	
	@GetMapping("/students/science")
	public ResponseEntity<Integer> getAveragePercentInScience() throws StudentException{
		return new ResponseEntity<Integer>(studentServ.getAverageMarksInScience(),HttpStatus.OK);
	}
	
}
