package com.phoenix.demos;

public class ModularThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InterfaceThread t1=new InterfaceThread();
		try {
			Thread t1=new Thread(new InterfaceThread());
			Thread t2=new Thread(new ConnectThread());
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			ModularThreading app=new ModularThreading();
			app.processSix();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void processSix()
	{
		System.out.println("Process Six to Eight");
	}
}
