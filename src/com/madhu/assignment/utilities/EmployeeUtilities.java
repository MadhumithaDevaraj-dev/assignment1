package com.madhu.assignment.utilities;

import com.madhu.assignment.employee.Employee;
import com.madhu.assignment.employee.Manager;
import com.madhu.assignment.employee.Developer;




public class EmployeeUtilities {
	
	public void printEmployeeDetails(Employee employee) {
		System.out.println("Employee Name:" + employee.getName());
		System.out.println("Employee ID:" + employee.getEmployeeId());
		System.out.println("Salary:" + employee.getsalary());
		
		if (employee instanceof Manager) {
			Manager manager = (Manager) employee;
			System.out.println("Department:" + manager.getDept());
		}else if (employee instanceof Developer) {
			Developer developer = (Developer) employee;
			System.out.println("programming languages:" +developer.getPro_lang());
		}
	}
}
 