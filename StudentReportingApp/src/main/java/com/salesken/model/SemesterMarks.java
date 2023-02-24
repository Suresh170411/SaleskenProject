package com.salesken.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SemesterMarks {

	private Integer semester1_english;
	private Integer semester1_math;
	private Integer semester1_science;
	
	private Integer semester2_english;
	private Integer semester2_math;
	private Integer semester2_science;
}
