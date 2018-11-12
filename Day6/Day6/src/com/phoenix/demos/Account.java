package com.phoenix.demos;

public class Account {
	
	float balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(float v1)
	{
		balance=v1;
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
		
		Account act=new Account(1000);
		try
		{
			act.withdraw(2000);
		}
		catch(LowBalanceException lbe)
		{
			System.out.println("Write the code for mailing here");
		}
	}
}
