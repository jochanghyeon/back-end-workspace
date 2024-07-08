package com.kh.polymorphsim;

import com.kh.polymorphsim.controller.EmployeeController;

public class Appliction {


Employee[] empArr = {e1, e3, m2, s2};


EmployeeController control = new EmployeeController();
control.findEMployeeByName("윤유진", empArr);
}

EmployeeController control =new EmployeeController();
Employee result = control.findEmployeeByName("윤유진",empArr)
System.out.println(result);

