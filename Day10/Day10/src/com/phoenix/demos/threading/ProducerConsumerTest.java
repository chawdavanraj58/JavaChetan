package com.phoenix.demos.threading;

public class ProducerConsumerTest {
	   public static void main(String[] args) {
	      SharedData c = new SharedData();
	      Producer p1 = new Producer(c, 1);
	      //Producer p2= new Producer(c, 1);
	      Thread c1 = new Thread(new Consumer(c, 1));
	      p1.start(); 
	      //p2.start();
	      c1.start();
	   }
	}

