package Operation;

import java.util.Scanner;

public class OperationMain {
	
	public static void main(String[] args) {
		int a,b,result;
		
		Scanner sc = new Scanner(System.in)	;
		
		System.out.println("Enter  number1");
		a = sc.nextInt();
		System.out.println("Enter  number2");
	  
		b= sc.nextInt();
		
		Add obj = new Add();
		int add_res =obj.add(a,b);
		//System.out.println("return type" +obj.addret());
		System.out.println("addition of three values" +obj.add(a, b, 25));
		System.out.println("addition of two numbers a+b is : " +add_res);
		Sub objsub = new Sub();
		int sub1_res = objsub.sub(a,b);
		System.out.println("subtraction of two numbers a+b is : " +sub1_res);
		objsub.sub(a,b);
	}

}
