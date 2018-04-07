package com.learn.corejava;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] abc) {
		int i;
		int num = 0;
		String primeNumbers = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to enter for value n");
		int n = sc.nextInt();
		for (i = 1; i <= n; i++)
		{
			int counter = 0;
			for (num = i; num >= 1; num--) 
			{
				if (i % num == 0) 
				{
					counter = counter + 1;
				}
			}
			if (counter == 2) 
			{

				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to " + n + " are :");
		System.out.println(primeNumbers);
	}
}
