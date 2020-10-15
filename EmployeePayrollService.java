package com.bridgelab.javaIO;

import java.util.*;

public class EmployeePayrollService 
{
	// enum of io services
	enum IOService {
		CONSOLE_IO,FILE_IO
	}
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
	public void writeEmployeePayrollData(IOService ioService) {
		if(ioService.equals(IOService.CONSOLE_IO)) {
		System.out.println("employee details :: ");
		for(EmployeePayrollData e : employeePayrollList) {
			e.display();
		}}
		else if(ioService.equals(IOService.FILE_IO)) {
			new EmployeePayrolFileIOService().writeData(employeePayrollList);
		}
	}
    
	// print data according io services
	public void printData(IOService ioServices) {
	    if(ioServices.equals(IOService.FILE_IO))
	    	new EmployeePayrolFileIOService().printData();
	}

	// counting the entries
	public long countEntries(IOService fileIo) {
		if(fileIo.equals(IOService.FILE_IO))
			return new EmployeePayrolFileIOService().countEntries();
		return 0;
	}
}
