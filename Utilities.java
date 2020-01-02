package com.deloitte.employee;

public class Utilities {

	public static boolean nameValidation(String empName) {
		String pattern = "^[A-Za-z]+$";
		if (empName.matches(pattern))
			return true;

		else {
			System.out.println("Please enter name in alphabets");
			return false;
		}
	}

	public static boolean salaryValidation(String empSalary) {
		String pattern = "^[0-9]+$";
		if (empSalary.matches(pattern))
			return true;

		else {
			System.out.println("Please enter salary in numbers");
			return false;
		}
	}

	public static boolean roomidValidation(String roomid) {
		String pattern = "^[0-9]{2}$";
		if (roomid.matches(pattern)) {
			return true;
		}else
			return false;
	}
}