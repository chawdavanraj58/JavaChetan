package com.phoenix.demos;

public class InterfaceThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		ProcessOne();
		ProcessTwo();
		ProcessFive();
	}

	public void ProcessOne()
	{
		System.out.println("Process 1");
	}
	
	public void ProcessTwo()
	{
		System.out.println("Process 2");
	}
	
	public void ProcessFive()
	{
		System.out.println("Process 5");
	}
}
