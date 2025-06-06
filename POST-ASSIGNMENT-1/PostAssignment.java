package addon_day1;

import java.util.Scanner;

public class PostAssignment {

public static int sumDigit(int n) {
	if (n==0) {
		return 0;
	}
	return n%10+sumDigit(n/10);
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int no=s.nextInt();
	System.out.println(sumDigit(no));
	s.close();
}
}
