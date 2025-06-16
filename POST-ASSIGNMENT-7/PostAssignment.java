package addon_day7;
import java.util.Arrays;
import java.util.Scanner;

public class PostAssignment {

    void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (k = 0; k < temp.length; k++) {
            arr[left + k] = temp[k];
        }
    }

    public static void main(String[] args) {
    	Scanner s =new Scanner(System.in);
		System.out.println("\n Enter the array length:");
		int size = s.nextInt();
		int arr[]=new int[size];
		System.out.println("\n Enter the array elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
        System.out.println(Arrays.toString(arr));
        

        PostAssignment sorter = new PostAssignment();
        sorter.mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
