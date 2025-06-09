package addon_day2;

import java.util.Scanner;

public class MainProgram {
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;  

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;   
            end--;     
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = s.next();
        System.out.println("\nPALINDROME CHECKING");
        System.out.println("Is Palindrome? " + isPalindrome(str));
        s.close();
    }
}
