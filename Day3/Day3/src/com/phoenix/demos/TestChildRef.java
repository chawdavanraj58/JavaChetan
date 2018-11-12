package com.phoenix.demos;

public class TestChildRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalesPerson e=new SalesPerson();
		e.calcSal();
		Manager m=new Manager();
		m.calcSal();
		
		Employee[] empl=new SalesPerson[4];
		SalesPerson[] sales=new SalesPerson[2];
		Manager[] mgr=new Manager[2];
		
		/*Employee s=new Employee();
		SalesPerson s1=(SalesPerson)s;
		System.out.println(s1.commission);*/
		/*for(Employee e2:empl)
		{
			e2.calcSal();
		}*/
		/*for(SalesPerson s:sales)
		{
			s.calcSal();
		}*/
	}

}






