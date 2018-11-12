package com.phoenix.demos.threading;

public class MultipleThreadsOneObject implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run called");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleThreadsOneObject app=new MultipleThreadsOneObject();
		Thread t1=new Thread(app);
		Thread t2=new Thread(app);
	}

}
