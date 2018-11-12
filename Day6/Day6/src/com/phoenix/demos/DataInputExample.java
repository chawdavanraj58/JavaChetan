package com.phoenix.demos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataInputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner sc=new Scanner(System.in);
			int variableValue=sc.nextInt();
			System.out.println(variableValue);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("You have entered wrong data");
		}
		System.out.println("After the try block");
	}

}
