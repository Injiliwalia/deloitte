package com.deloitte.employee;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("please enter name");
		String name=s.next();
		System.out.println("please enter salary");
		String Salary=s.next();
		
		boolean nameFlag=Utilities.nameValidation(name);
		boolean salaryFlag=Utilities.salaryValidation(Salary);	
		Employee emp1 =new Employee();
			if(nameFlag && salaryFlag) {
	emp1.setDeptId("AA");
	emp1.setEmpName(name);
	emp1.setEmpId(102);
	emp1.setSalary(Double.parseDouble(Salary));
	
	System.out.println(emp1.getSalary());
		System.out.println(emp1.getEmpName());


	}

	}
}