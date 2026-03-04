public class MaximumSubarray {

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        if (arr == null || arr.length == 0) {
            System.out.println("Array must not be empty");
            return;
        }

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Either extend previous subarray or start new
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update overall maximum
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
