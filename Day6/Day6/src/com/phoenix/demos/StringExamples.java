package com.phoenix.demos;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=new String("Hello");
		String s3=s1;
		System.out.println(s1.hashCode()+ " "+s3.hashCode());
		String s2=new String("Hello");
		s1+=" World";
		System.out.println(s1.hashCode()+ " "+s3.hashCode());
		
		if(s1==s2)
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}

	}

}
