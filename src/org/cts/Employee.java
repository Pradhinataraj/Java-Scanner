package org.cts;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Pls Enter the EmpId");
		int empID =s.nextInt();
		System.out.println("Enter the EmpName");
		String empName=s.next();
		System.out.println("Enter the EmpEmail");
		String empEmail=s.next();
		System.out.println("Enter the EmpPhoneno");
		Long empPhoneno=s.nextLong();
		System.out.println("Enter the EmpSalary");
		float empSalary=s.nextFloat();
		System.out.println("Enter the EmpGender");
		String empGender=s.next();
		System.out.println("Enter the EmpCity");
		String empCity= s.next();
		System.out.println("Employee Id"+"\t"+ empID);
		System.out.println("Employee Name"+"\t"+ empName);
		System.out.println("Employee Email"+"\t"+empEmail);
		System.out.println("Employee Phoneno"+"\t"+empPhoneno);
		System.out.println("Employee Salary"+"\t"+empSalary);
		System.out.println("Employee Gender"+"\t"+ empGender);
		System.out.println("Employee City"+"\t"+ empCity);
	}
}

 





