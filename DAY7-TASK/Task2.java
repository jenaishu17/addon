package addon_day7;

import java.util.Scanner;

public class Task2 {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter array size");
    	int size=sc.nextInt();
    	int numbers[]=new int[size];
    	System.out.println("Enter array elements");
    	for(int i=0;i<size;i++) {
    		numbers[i]=sc.nextInt();
    	}
//        int[] numbers = {10, 7, 8, 9, 1, 5};
        System.out.println("Original array:");
        printArray(numbers);

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted array:");
        printArray(numbers);
        sc.close();
    }
}
