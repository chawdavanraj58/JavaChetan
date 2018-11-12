package com.phoenix.demos;

public class Manager extends Employee {

	int teamSize;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public Manager(int v1, String v2, float v3, int v4)
	{
		super(v1,v2,v3);
		teamSize=v4;
	}
	
	@Override
	public void travel() {
		// TODO Auto-generated method stub

	}

	@Override
	public float calcSal() {
		// TODO Auto-generated method stub
		
		return getEmpSalary()+teamSize*1000;
	}

}
