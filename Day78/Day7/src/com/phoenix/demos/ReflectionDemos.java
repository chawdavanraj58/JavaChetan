package com.phoenix.demos;

import java.lang.reflect.Field;

public class ReflectionDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class metaData=Class.forName("com.phoenix.demos.Account");
			
			//find variables in the class
			
			Field[] fields=metaData.getFields();
			for(Field f:fields)
			{
				System.out.println(f.getName());
			}
			
			//find methods in the class
			/*Method[] methods=metaData.getDeclaredMethods();
			for(Method m:methods)
			{
				System.out.println("The function name is "+m.getName());
				System.out.println("The function has "+m.getParameterCount()+" parameters");
				if(m.getParameterCount()>0)
				{
					Parameter[] params=m.getParameters();
					//System.out.println(params.);
					for(Parameter p:params)
					{
						System.out.println("Parameter : "+p.getType() + " Access Specifier :" +p.getModifiers());
					}
				}
			}*/
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
