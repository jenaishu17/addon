package addon_day2;
import java.util.Scanner;

public class PostAssignment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n = s.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        boolean found = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == 8) {
                    System.out.println("TARGET ACQUIRED AT INDEX:");
                    System.out.println("Index 1: " + i);
                    System.out.println("Index 2: " + j);
                    System.out.println("Values:");
                    System.out.println(a[i]);
                    System.out.println(a[j]);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("TARGET NOT FOUND");
        }
    s.close();
    }
}
