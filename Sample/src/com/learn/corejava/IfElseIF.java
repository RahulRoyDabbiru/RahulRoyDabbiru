package com.learn.corejava;

import java.util.Scanner;

public class IfElseIF {

	public static void main(String[] args)
	{
	int age ;
	Scanner input = new Scanner(System.in);
	System.out.println("please Enter age:");
	age = input.nextInt();
	if(age>18  &&  age < 35)
	{
	System.out.println("age is between");
	}
	else if(age>39 &&  age<65)
	{
	System.out.println("age is between");
	}
	else
	{
	System.out.println("not matched");
	}
	}
	}

