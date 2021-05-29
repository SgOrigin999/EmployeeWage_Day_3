package com.bridgelab.day3;

public class EmployeeWage {
	public static int FULL_TIME = 1;
	public static int WAGEPERHOUR = 20;
	public static int FULL_TIME_HRS = 8;

	public static void calculateWage() {
		int totalWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == 1) {
			totalWage = WAGEPERHOUR * FULL_TIME_HRS;
			System.out.println("Employee daily Wage::" + totalWage);
		} else {
			System.out.println("Employee daily Wage::" + totalWage);
		}
	}

	public static void checkAvilablity() {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		System.out.println("Emp Check Value::" + empCheck);
		if (empCheck == FULL_TIME) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is not Present");
		}
	}
	
	public static void partTimeWage() {
		int totalWage = 0;
		int partTimrHrs=8;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == 1) {
			totalWage = WAGEPERHOUR * partTimrHrs;
			System.out.println("Employee PartTimeIf Present Wage::" + totalWage);
		} else {
			System.out.println("Employee Absent Then Wage::" + totalWage);
		}
	}

	public static void main(String[] args) {
		System.out.println("Part Time Wage::");
		partTimeWage();
		System.out.println("Calculate Daily Wage::");
		calculateWage();
		System.out.println("Check Employee Avilablity::");
		checkAvilablity();
		System.out.println("Welcome To Employee Wage::");

	}
}
