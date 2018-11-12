package com.phoenix.demos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("unchecked")
		ArrayList<Account> accountList=new ArrayList();
		
		ArrayList<ArrayList<Account>> org=new ArrayList();
		
		System.out.println(accountList.size());
/*		accountList.add("FirstAccount");
		accountList.add(23);*/
		accountList.add(new Account());
		System.out.println(accountList.size());
		accountList.remove(0);
		accountList.add(0, new Account());
		Account test=new Account(10,"XYZ",10000);
		accountList.add(test);
		//accountList.add(3,null);
		accountList.add(1,new Account(4,"ABC",1000));
		test.actId=100;
		//Simplest way of iterating over a list
		for(int listCtr=0;listCtr<accountList.size();listCtr++)
		{
			Account tempAcct=accountList.get(listCtr);
			System.out.println(tempAcct.actId);
		}
		
		//For each 
		for(Account a:accountList)
		{
			//Perform the operations
		}
		
		//Iterator
		
		Iterator<Account> iter=accountList.iterator();
		while(iter.hasNext())
		{
			Account objRef=iter.next();
			if(objRef.actId==100)
			{
				iter.remove();
			}
		}
	}

}




