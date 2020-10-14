package com.bridgelab.javaIO;

import java.util.*;

public class EmployeePayrollService 
{
    //list of employee
	private List<EmployeePayrollData> employeePayrollList;
	
	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
		
		this.employeePayrollList = employeePayrollList;
	}
	
	// takes input from console
	private void readEmployeePayrollData(Scanner consoleInputReader) {
		System.out.println("Enter emp Id: ");
		int id = consoleInputReader.nextInt();
		consoleInputReader.nextLine();
		System.out.println("Enter employee name: ");
		String name = consoleInputReader.nextLine();
		System.out.println("Enter employee salary: ");
		double salary = consoleInputReader.nextDouble();
		employeePayrollList.add( new EmployeePayrollData(id, name, salary));
	}
	
	// output on the console
	private void writeEmployeePayrollData() {
		System.out.println("employee details :: ");
		for(EmployeePayrollData e : employeePayrollList) {
			e.display();
		}
	}
	public static void main(String[] args) {
		List<EmployeePayrollData>  employeePayrollList = new ArrayList<>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		//input stream
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(consoleInputReader);
		employeePayrollService.writeEmployeePayrollData();
		
	}
}
