package com.learn.corejava;

import java.util.Scanner;

public class factorial {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		int i=1,fact=1;
		while(i<=number)
		{
			fact=fact*i;
			i++;
			
		}
		System.out.println("Factorial of "+number+" is: "+fact);
	}

}
