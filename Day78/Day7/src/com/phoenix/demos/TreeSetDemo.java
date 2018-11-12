package com.phoenix.demos;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Account> tree=new TreeSet<>();
		tree.add(new Account(1,"A",2000));
		tree.add(new Account(4,"D",2000));
		tree.add(new Account(2,"B",2000));
		tree.add(new Account(5,"E",2000));
		tree.add(new Account(1,"A",2000));
		
		for(Account temp:tree)
		{
			System.out.println(temp.actName);
		}

	}

}
