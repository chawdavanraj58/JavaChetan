package com.phoenix.demos;

public class SimpleThreading extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleThreading t1=new SimpleThreading();
		SimpleThreading t2=new SimpleThreading();
		t1.setName("Thread one");
		
		t1.start();
		t2.start();
		
	}
	
	public void run()
	{
		String name=Thread.currentThread().getName();
		if(name.equals("Thread one"))
		{
			System.out.println("First Thread running");
		}
		else
		{
			System.out.println("Second Thread running");
		}
	}

}
