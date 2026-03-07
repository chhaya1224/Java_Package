import java.util.Arrays;

public class Main {
    public static int findMinDiff(int arr[]) {
        Arrays.sort(arr);                    // Step 1: sort the array
        int minDiff = Integer.MAX_VALUE;     // Step 2: initialize minimum difference
        
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];  // difference of adjacent elements
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int arr[] = {3, 8, 15, 17};
        System.out.println("Minimum absolute difference: " + findMinDiff(arr));
    }
}
