package com.day3;

public class Employee {
	private long empId;
	private String empName;
	private double basicSalary;
	private double medicalExpense;
	private double netSal;
	private double hra;
	private double pf;
	private double grossSal;
	
	public Employee() {
}

	
	public Employee(long empId, String empName, double basicSalary, double medicalExpense) {
		this.empId=empId;
		this.empName=empName;
		this.basicSalary=basicSalary;
		this.medicalExpense=medicalExpense;
	
		
	}
	public double calculateNetSalary() {
		
		hra = 0.5*basicSalary;
	    pf = 0.12*basicSalary;
	    grossSal = hra + basicSalary + medicalExpense;
	    netSal = grossSal - (pf+200);
	    return netSal;
	}
	
		
	
	public void displayEmployeeInfo() {
		
		
		System.out.println("EmployeeId: "+empId+"\nEmployeeName: "+empName+"\nNetSalary:"+netSal);
	}
}
	
	
	
	


