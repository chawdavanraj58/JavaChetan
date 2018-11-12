package com.phoenix.demos;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Employee firstEmp=new Employee();
		firstEmp.attendance();*/
		
		/*SalesPerson sales=new SalesPerson();
		sales.attendance();
		
		Employee secondEmp=new SalesPerson();
		secondEmp.attendance();*/
		
		TestEmp mainApp = new TestEmp();
		
		Employee[] employees=new Employee[2];
		employees[0]=new SalesPerson(1,"XYZ",10000,2000);
		employees[1]=new Manager(2,"ABC",200000,10);
		
		for(Employee current:employees)
		{
			//System.out.println("Each object will be retrieved "+current.getEmpName());
			mainApp.calcTotalSalary(current);
		}
		//mainApp.attendAllEmployees(sales);
		
		/*SalesPerson salesEmp=new Employee();
		salesEmp.attendance();*/
	}
	
	public float calcTotalSalary(Employee e)
	{
		/*System.out.println(e.commission);
		e.getCommission();*/
		return e.calcSal();
	}

	public void attendAllEmployees(Employee e)
	{
		e.attendance();
	}
	
	public void totalSalaryPaid(Employee[] e)
	{
		float total=0.0f;
		for(Employee e1: e)
		{
			total+=e1.calcSal();
		}
		System.out.println("Total Salary :"+total);
	}
}
