package com.learn.corejava;

import java.util.Scanner;

public class Sum {

	       public static void main(String[] args) 
	       {
	    	   int n,sum=0;

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter n value");
	        n = sc.nextInt();
	       // int a[]= new int[n];//
	       // System.out.println("enter the  "+n+" numbers");//
	        
			/*for(int i =0; i < n;i++)  
	        { 
	        System.out.println("Enter number:");
	        //a[i]=sc.nextInt();//	       
	        }*/
			for(int i =0; i <= n;i++)  
			{
				
	        
	        sum=sum+i;
	        
	        }
			System.out.println("Sum is:"+sum);
	        //System.out.println("Sum of "+n+" number is="+sum);//
	    }
	}