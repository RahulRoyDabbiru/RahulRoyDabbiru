import java.util.Scanner;

public class primeNum {

	public static void main(String[] abc) {
		int i;
		int n = 0;
		String primeNumbers = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to enter for value n");
		int n1 = sc.nextInt();
		for (i = 1; i < n1; i++) {
			int counter = 0;
			for (n1 = i; n1 >= 1; n1--) {
				if (i % n1 == 0)

				{
					counter = counter + 1;
				}
			}
			if (counter == 2) {

				primeNumbers = primeNumbers + i + " ";
			}
		}

		System.out.println("is a prime number");
	}
}

/*
 * for(int i=1;i<n;i++) { int p1=0; for(int j=1;j<i;j++) {
 * 
 * if(i%j==0) p=1; } if(p==0) {
 * 
 * 
 * 
 * System.out.println("Prime numbers from 1 to n are: "); System.out.println(i);
 * 
 * }}}}
 */
