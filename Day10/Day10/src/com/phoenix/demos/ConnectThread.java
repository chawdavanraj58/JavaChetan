package com.phoenix.demos;

public class ConnectThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		ProcessThree();
		ProcessFour();
	}

	public void ProcessThree()
	{
		System.out.println("Process 3");
	}
	
	public void ProcessFour()
	{
		System.out.println("Process 4");
	}
}
