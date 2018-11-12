package com.phoenix.demos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Account> setObjects=new HashSet();
		
		setObjects.add(new Account());
		setObjects.add(new Account(23,"QWER",10000));
		setObjects.add(new Account(23,"QWER",10000));
		//setOfObjects.add(0,"InsertAtFirst");
		System.out.println(setObjects.size());
		
		Iterator<Account> iter=setObjects.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next().toString());
		}
		
	}

}
