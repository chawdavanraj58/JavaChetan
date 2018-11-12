package com.phoenix.demos;

public class SalesPerson extends Employee {

	float commission;
	
	public SalesPerson() {
		// TODO Auto-generated constructor stub
	}
	
	public SalesPerson(int v1, String v2, float v3, float v4)
	{
		super(v1,v2,v3);
		//super(v1,v2,v3);
		commission=v4;
		
/*		//empId=v1;
		empName=v2;
		empSalary=v3;*/
	}
	
	public void attendance()
	{
		System.out.println("SalesPerson checking in");
	}


	public void travel() {
		System.out.println("Travelling mode of salesperson");
	}

	@Override
	public float calcSal() {
		// TODO Auto-generated method stub
		return this.getEmpSalary()+commission;
	}
}
