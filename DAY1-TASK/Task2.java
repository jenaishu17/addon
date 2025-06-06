package addon_day1;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
	
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	
	System.out.println("Enter the array length:");
	int n = s.nextInt();
	int[] a =new int[n];
	System.out.println("Enter the array elements:");
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	
	System.out.println("\n Minimum value: "+a[0]);
	System.out.println("\n Maximum value: "+a[n-1]);
	s.close();
}
}
