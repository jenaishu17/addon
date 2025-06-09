package addon_day1;
import java.util.Scanner;
public class PostAssignment {
	 public static int sumDigits(int n) {
	        if (n == 0) {
	            return 0;
	        }
	        return (n % 10) + sumDigits(n / 10);
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a Number: ");
	        int number = sc.nextInt();
	        int result = sumDigits(number);
	        System.out.println("Sum of digits: " + result);
	        sc.close();
	    }
}
