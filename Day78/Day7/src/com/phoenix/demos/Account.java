package com.phoenix.demos;

public class Account implements Comparable {
	
	public int actId;
	String actName;
	float balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(int v2, String v3, float v1)
	{
		balance=v1;
		actId=v2;
		actName=v3;
	}

	public void withdraw(float amount) throws LowBalanceException
	{
		balance-=amount;
		if(balance<0)
		{
				throw new LowBalanceException("Insufficient balance");
		}
	}
	
	public static void main(String[] args) {
		
		Account act=new Account(1,"XYZ",1000);
		try
		{
			act.withdraw(2000);
		}
		catch(LowBalanceException lbe)
		{
			System.out.println("Write the code for mailing here");
		}
	}

	@Override
	public int compareTo(Object o) {
		Account secondObject=(Account)o;
		if(this.actId>secondObject.actId)
		{
			return -1;
		}
		else
			if(this.actId <secondObject.actId)
			{
				return 1;
			}
			else
			{
				return 0;
			}
	}
}
