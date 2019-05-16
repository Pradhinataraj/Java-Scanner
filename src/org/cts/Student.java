package org.cts;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("Enter a Mark1");
		int mark1 =s.nextInt();
		System.out.println("Enter a Mark2");
		int mark2=s.nextInt();
		System.out.println("Enter a Mark3");
		int mark3=s.nextInt();
		System.out.println("Enter a Mark4");
		int mark4=s.nextInt();
		System.out.println("Enter a Mark5");
		int mark5=s.nextInt();
		int Total = mark1+ mark2+ mark3+ mark4+ mark5;
		System.out.println("Total is"+ Total);
float Average = Total/5;
System.out.println("Average"+ Average);

	}
}
