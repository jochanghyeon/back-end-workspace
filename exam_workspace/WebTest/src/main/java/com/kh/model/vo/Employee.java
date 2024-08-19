package com.kh.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Employee {
	private int empId;
	private String empName;
	private String email;
	private String phone;
	
	
}
