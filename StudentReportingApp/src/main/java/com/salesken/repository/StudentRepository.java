package com.salesken.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.salesken.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	public Optional<Student> findByRoll(Integer roll);
	
//	@Query(value = "select student_id,name,roll,gender,city,state,pin,(semester1_english+semester1_math+semester1_science+semester2_english+semester2_math+semester2_science) as total_marks from student ORDER BY total_marks DESC LIMIT 2")
//	public List<Student> getAllStudentByroll();
}
