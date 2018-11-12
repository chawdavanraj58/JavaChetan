package com.phoenix.demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyWithFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinallyWithFunctions mainApp=new FinallyWithFunctions();
		mainApp.someFunction();
		System.out.println("After the method");
		

	}
	
	public void someNewFunction()
	{
		try(FileInputStream fis=new FileInputStream("text.txt"))
		{
			
		}
		catch(FileNotFoundException fne)
		{
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void someFunction()
	{
		FileInputStream fis=null;
		try {
			fis= new FileInputStream("text.txt");
			fis.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Within finally");
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
