package com.phoenix.demos;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Account implements Comparable,Externalizable {
	
	public int actId;
	String actName;
	float balance;
	volatile PersonalInfo info;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(int v2, String v3, float v1,PersonalInfo info)
	{
		balance=v1;
		actId=v2;
		actName=v3;
		this.info=info;
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
		
		Account act=new Account(1,"XYZ",1000,new PersonalInfo());
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

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
}
