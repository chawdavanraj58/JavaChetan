package com.phoenix.demos;

public abstract class Employee {
	
	private int empId;
	String empName;
	private float empSalary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int v1, String v2, float v3)
	{
		empId=v1;
		empName=v2;
		empSalary=v3;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	
	public void attendance()
	{
		System.out.println("Employee checking in");
	}

	public abstract void travel();
	
	public abstract float calcSal();
	
	public float getCommission()
	{
		return 0;
	}
}
