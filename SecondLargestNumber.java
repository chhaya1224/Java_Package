public class SecondLargestNumber {
    public static void main(String[] args) {
        int arr[] = { 100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // old largest becomes second
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);
    }
}
