package com.bridgelab.javaIO;

public class EmployeePayrollData {

	private int id;
	private String name;
	private double salary;
	public EmployeePayrollData(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void display() {
		System.out.println(id+" : "+ name+ " : "+ salary);
	}
}
