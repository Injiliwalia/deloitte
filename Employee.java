package com.deloitte.employee;

public class Employee {
	 private int empId;
	 private String empName;
	 private double salary;
	 private String deptId;

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	} 
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary=salary; 
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	Employee() {

	}

	Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public void deptChange(String deptName) {
		System.out.println("inside dept change method");
	}

	public double salaryIncrement(double amount) {
		System.out.println("inside dept change method");
		return 10.10;
	}
}
