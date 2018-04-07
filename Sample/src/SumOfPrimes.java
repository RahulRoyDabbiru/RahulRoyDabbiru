import java.util.Scanner;
	public class SumOfPrimes 
	{
    public static void main(String args[])
	 {
		 System.out.println("Enter n value");
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int sum=0;
		 for(int i=2;i<n;i++)
		 {
			 int f=0;
			 for(int j=2; j<i;j++)
			 {
				 if(i%j==0)
					 f=1;
			 }
			 if (f==0)
			 {
				 System.out.print(i+" ");
				 sum=sum+i;
			 }
		 }
		 System.out.println();
		System.out.println("Sum="+sum);		 
	 }
	}

