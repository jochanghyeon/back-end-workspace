package com.kh.polymorphsim.controller;

import com.kh.polymorphsim.model.child.Engineer;
import com.kh.polymorphsim.model.parent.employee;

public class EmployeeController {

	Employee employee new = Employee() {
	
	
	// 이름으로 사람 찾기
	public Employee findEmployeeByName(String name, Employee[] empArr)
		for(int i = 0; i <empArr[i].length; i++) {
			if(empArr[i].getName().equals(name)) {
			 return empArr[i];
			}
		}
	return null;
	}
	//찾는 사람의 연봉은?
	public int getAnnualSalary(Employee e) {
		if(e instanceof Engineer) { // 특정 자식 객체 찾는 방법!
			Engineer engineer = (Engineer) e;
			return e.getSalary() *12 + engineer.getBonus();
		}
		return e.getSalary() *12;
	
	
	int resultAnnual = control.getAnnualSalary(result);
	return e.getSalary()*12;
	}
	// 전체 사람들의 연봉 총합은?
	public int getTotalSalary(Employee[] empArr) {
		int sum = 0;
		for(Employee employee : empArr) {
			sum += getAnnualSalary(employee);
			
		}
		return sum;
		// 전체 총합
		System.out.println(control.getTotalSalary(empArr));
	}
	}
	

	
