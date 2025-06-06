package addon_day2;

import java.util.Arrays;

public class Task1 {
	public static void main(String[] args) {
		int[] a= {4,2,10,7,5,3,8};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		int start=0;
		int end=a.length-1;
		while(start<end) {
			int c=a[start];
			a[start]=a[end];
			a[end]=c;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(a));
		
	}

}
