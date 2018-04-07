package com.learn.corejava;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args)
	{

	int age;

	Scanner input = new Scanner(System.in);
	System.out.println("Please enter age:");
	age = input.nextInt();
	if(age>18)
	{
	System.out.println("above 18");
	}
	else
	{
	System.out.println("below 18");
	}
	}

}
