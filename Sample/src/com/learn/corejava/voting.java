package com.learn.corejava;

import java.util.Scanner;

public class voting {

	public static void main(String args[])
	{
		Scanner roy = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = roy.nextInt();
		System.out.println("Enter your country");
		String country = roy.next();
		System.out.println("Enter gender");
		char gender = roy.next().charAt(0);
		System.out.println("Enter your name");
		String name = roy.next();
		
		if (gender == 'm')  
		{
			if(age>=18 && country.equals("India"))
			{
				System.out.println("eligible to vote");
				
			}
			else if (age>=24  && country.equals("America"))
			{
				System.out.println("eligible to vote");
			}
			else
			{
				System.out.println("not eligible to vote");
			}
		}
		else
			
			
				if(age>=21 && country.equals("India") && gender == 'f')
                  
				{
					System.out.println("eligible to vote");
				}
		
				else if (age>=29 && country.equals("America") && gender == 'f')
                {
                	
	                System.out.println("eligible to vote");
	                
                }
else 
{
	System.out.println("not eligible to vote");
}
				
			
			}
			}
		
		

