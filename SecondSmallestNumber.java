public class SecondSmallestNumber {
    public static void main(String[] args) {
        int arr[] = { 100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest; // old smallest becomes second
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found.");
        } else {
            System.out.println("Smallest number: " + smallest);
            System.out.println("Second smallest number: " + secondSmallest);
        }
    }
}
