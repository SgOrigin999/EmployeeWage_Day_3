package com.bridgelab.day3;

public class EmployeeWage {
	public static void main(String[] args) {
		int Full_Time=1;
		
		System.out.println("Welcome To Employee Wage::");
		
		double empCheck=Math.floor(Math.random() * 10) % 2;
		System.out.println("Emp Check Value::"+empCheck);
		if(empCheck==Full_Time) {
			System.out.println("Employee is Present");
		}else
		{
			System.out.println("Employee is not Present");
		}
	}
}
