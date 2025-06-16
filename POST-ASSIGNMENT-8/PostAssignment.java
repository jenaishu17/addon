package addon_day8;
import java.util.Arrays;

public class PostAssignment {

    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;  // search on left side
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return result;
    }
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;  
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return result;
    }

    public static int frequencyCount(int[] arr, int target) {
        int first = firstOccurrence(arr, target);
        if (first == -1) return 0; 
        
        int last = lastOccurrence(arr, target);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 3, 4, 4, 5, 6, 6, 6, 6, 7};
        int target = 6;

        // Make sure array is sorted before binary searching
        Arrays.sort(arr);

        int freq = frequencyCount(arr, target);
        System.out.println("Frequency of " + target + " is: " + freq);
    }
}
