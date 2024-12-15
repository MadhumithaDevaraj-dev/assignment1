package com.madhu.assignment.employee;

public class Manager extends Employee{
	
	private String dept;
	
	public Manager(String name,int employeeId,double salary,String dept) {
		super(name,employeeId,salary);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept=dept;
	}
}