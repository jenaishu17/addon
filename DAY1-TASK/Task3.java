package addon_day1;

public class Task3 {
	public static int fib(int n) {
		if(n<=1) {
			return 1;
		}
		else
		{
		return fib(n-1) + fib(n-2);
	}
		}
	public static int fact(int n) {
		if(n==1) {
			return 1;	
		}
		return n * fact(n-1);
	}
public static void main(String[] args) {
	int a=10;
	for(int i=0;i<a;i++) {
		System.out.print(fib(i)+ " ");
	}
	System.out.println("\n" + fact(5));
}
}
