package com.learn.corejava;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args)
	{
	int age;
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter age");
	age = input.nextInt();
	switch(age)
	{
	case 18:
	System.out.println("age 18");
	break;
	case 24:
	System.out.println("age 24");
	break;
	default:
	System.out.println("not matched");

	}
	}
	}

