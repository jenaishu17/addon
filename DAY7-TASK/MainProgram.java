package addon_day7;

import java.util.Scanner;

public class MainProgram {
    void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	Scanner s =new Scanner(System.in);
    	System.out.println("\n Enter the array length:");
		int size = s.nextInt();
		int a[]=new int[size];
		System.out.println("\n Enter the array elements:");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}

        MainProgram sorter = new MainProgram();
        sorter.sort(a);
        sorter.printArray(a);
        s.close();
    }



}
