package Operation;

import java.util.Arrays;

public class Array1 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[1000];
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
			arr[i]=i;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			arr[i]=i;
		}
		
	}

}
